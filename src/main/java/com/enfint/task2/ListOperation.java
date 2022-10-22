package com.enfint.task2;


import java.util.*;

public class ListOperation {

    public static int integerSum(List<String> input) {
        // TODO: task2

        // Convert list to a single string
        StringBuffer sb = new StringBuffer();
        for (String ab : input){
            sb.append(ab);
            sb.append(" ");
        }
        String str = sb.toString();


        int sum = Arrays.stream(str.split(" "))
                .filter(el -> el != null)
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        return sum;
    }

}
