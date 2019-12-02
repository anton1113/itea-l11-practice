package com.itea.java.basic;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("Hello");
        list.add("My name is Anton");
        list.add("Nice to meet you");

        list.add(0, "Oh");
        list.add(2,"!");

        System.out.println(list);

        List<String> stringList = new ArrayList<String>();
//        stringList.add(4325);
        stringList.add("regreg");

        arraySum();
        getMax();
    }

    private static void arraySum() {
        List<Integer> list = new ArrayList<>();

        int sum = 0;

        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }

    private static void getMax() {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        integerList.add(2, 14);

        int max = integerList.get(0);

        for (int i : integerList) {
            if (i < max) {
                max = i;
            }
        }

        for (Integer integer : integerList) {
            if (integer > max) {
                max = integer;
            }
        }

        System.out.println(max);
    }
}
