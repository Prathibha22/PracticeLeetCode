package org.example;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution("Gnbdg986~"));
    }
    public static boolean solution(String s) {
        // Implement your solution here :program to check password validity
        //validate for null, empty, space and length
        if(s == null || s == "" || s.contains(" ") || s.length() < 6) {
            return false;
        }
        //validate for mandatory chars
        int specialCharCount = 0;
        int digitCount = 0;
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        Pattern specialCharPattern = Pattern.compile("[!@#$%^&*()_]");
        if(specialCharPattern.matcher(s).find()){
            specialCharCount++;
        }
        char[] passChars = s.toCharArray();
        for(char c: passChars) {
            if(Character.isUpperCase(c)){
                upperCaseCount++;
            }
            if(Character.isLowerCase(c)){
                lowerCaseCount++;
            }
            if(Character.isDigit(c)){
                digitCount++;
            }
        }
        if (specialCharCount >= 1 && digitCount >= 1 && lowerCaseCount >= 1 && upperCaseCount >= 1) {
            return true;
        }
        return false;
    }
}

