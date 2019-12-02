package com.itea.java.basic;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        Integer l1 = s1.length();
        Integer l2 = s2.length();
        return s1.compareTo(s2);
    }
}
