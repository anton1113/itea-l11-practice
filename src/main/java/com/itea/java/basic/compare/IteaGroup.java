package com.itea.java.basic.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteaGroup {

    private List<IteaStudent> students = new ArrayList<>();

    public IteaGroup() {
        students.add(new IteaStudent("Serg", "Golin'ko"));
        students.add(new IteaStudent("Natalia", "Borodachova"));
        students.add(new IteaStudent("Denis", "Sedov"));
        students.add(new IteaStudent("Nick", "Belov"));
        students.add(new IteaStudent("Serg", "SM"));
    }

    public void introduceGroup() {
        Collections.sort(students, new LastNameLengthComparator());
        for (IteaStudent student : students) {
            student.introduce();
        }
    }
}
