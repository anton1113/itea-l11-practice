package com.itea.java.basic.compare;

public class IteaStudent implements Comparable<IteaStudent> {

    private String firstName;
    private String lastName;

    private boolean isPresent = true;

    public IteaStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void introduce() {
        System.out.println("Hello, I am " + firstName + " " + lastName);
    }

    @Override
    public int compareTo(IteaStudent o) {
        return this.lastName.compareTo(o.lastName);
    }
}
