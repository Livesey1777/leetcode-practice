package practice.leetcode.problems.p0380insertdeletegetrandomo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        int last = list.getLast();
        if (index != list.size() - 1) {
            list.set(index, last);
            map.put(last, index);
        }
        list.removeLast();
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get((int) (Math.random() * list.size()));
    }
}
