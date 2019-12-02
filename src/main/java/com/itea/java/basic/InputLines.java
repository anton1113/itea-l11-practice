package com.itea.java.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputLines {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        String line = "";
        while (!"0".equals(line)) {
            line = SCANNER.nextLine();
            lines.add(line);
        }
        System.out.println(lines);
    }
}
