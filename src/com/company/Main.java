package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isDoubloon(String word) {
        String testString = word.toLowerCase();
        for (int i = 1; i < testString.length(); i++) {
            int count = 0;
            for (int j = 0; j < testString.length(); j++)
                if (testString.charAt(i) == testString.charAt(j))
            {
                count++;
            }

            if (2 < count || 1 == count) {
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        boolean result = isDoubloon(word);
        if (result) {
            System.out.println(word + " is a doubloon");
        } else {
            System.out.println(word + " is not a doubloon");
        }
    }
}

