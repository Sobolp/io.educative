package arrays;

import java.util.ArrayList;
import java.util.Objects;

class Pair {
    public int first;
    public int second;

    public Pair(int x, int y) {
        this.first = x;
        this.second = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}

class MergeIntervals {
    static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) {
        ArrayList<Pair> result = new ArrayList<>();
        Pair tmp = v.remove(0);
        for (Pair i : v) {
            if (i.first <= tmp.second) {
                if (i.second > tmp.second) {
                    tmp.second = i.second;
                }
            } else {
                result.add(tmp);
                tmp = i;
            }
        }
        result.add(tmp);
        return result;
    }
}