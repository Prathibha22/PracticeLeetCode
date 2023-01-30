package org.example;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    int res=solution();
        System.out.println(res);

    }
    public static int solution() {
        // Implement your solution here
        int output=0;

        int[] A={1,3,6,4};
        for(int i=1;i<A.length;i++) {
            if (!Arrays.asList(A).contains(i)) {
                return i;
            }
        }
           return output;
    }

}