package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList)
    {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double funcA = (5 * Math.pow(Integer.parseInt(a), 2)) + 3;
        double funcB = (5 * Math.pow(Integer.parseInt(b), 2)) + 3;
        int result = Double.compare(funcA, funcB);
        if (result == 0) {
            return Math.min(Integer.parseInt(a), Integer.parseInt(b));
        }
        return result;
    }
}
