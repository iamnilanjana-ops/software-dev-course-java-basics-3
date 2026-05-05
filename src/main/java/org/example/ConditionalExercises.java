package org.example;

public class ConditionalExercises {

    // 1. lessThanFive
    public static boolean lessThanFive(int number) {
        if (number < 5) {
            return true;
        } else {
            return false;
        }
    }

    // 2. getAgeGroup
    public static String getAgeGroup(int age) {
        if (age >= 0 && age <= 12) {
            return "child";
        } else if (age >= 13 && age <= 19) {
            return "teen";
        } else {
            return "adult";
        }
    }

    // 3. isValidPassword
    public static boolean isValidPassword(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}