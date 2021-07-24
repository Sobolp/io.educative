package arrays;

class LeastCommonNumber {
    static Integer findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i1 < arr1.length && i2 < arr2.length && i3 < arr3.length) {
            if (arr1[i1] == arr2[i2] && arr2[i2] == arr3[i3]) {
                return arr1[i1];
            }
            if (arr1[i1] > arr2[i2]) {
                if (arr1[i1] > arr3[i3]) {
                    i2++;
                    i3++;
                } else if (arr3[i3] > arr1[i1]) {
                    i1++;
                    i2++;
                } else {
                    i2++;
                }
            } else if (arr2[i2] > arr3[i3]) {
                i1++;
                i3++;
            } else if (arr3[i3] > arr2[i2]) {
                i1++;
                i2++;
            }  else {
                i1++;
            }
        }
        return -1;
    }

}
