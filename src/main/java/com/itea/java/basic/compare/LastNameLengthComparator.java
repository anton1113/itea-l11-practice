package com.itea.java.basic.compare;

import java.util.Comparator;

public class LastNameLengthComparator implements Comparator<IteaStudent> {

    @Override
    public int compare(IteaStudent o1, IteaStudent o2) {

        int lastNameLen1 = o1.getLastName().length();
        int lastNameLen2 = o2.getLastName().length();

        return lastNameLen1 - lastNameLen2;
    }
}
