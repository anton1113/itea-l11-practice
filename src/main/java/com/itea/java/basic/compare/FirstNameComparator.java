package com.itea.java.basic.compare;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<IteaStudent> {

    @Override
    public int compare(IteaStudent o1, IteaStudent o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
