package com.itea.java.basic;

import static com.itea.java.basic.Example.*;
import static com.itea.java.basic.Example2.*;

public class Application {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2); // false ==> true
        System.out.println(s1.equals(s2)); // true

        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

    }
}
