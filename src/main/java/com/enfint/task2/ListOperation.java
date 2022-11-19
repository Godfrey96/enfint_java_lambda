package com.enfint.task2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ListOperation {

    public static int integerSum(List<String> input) {
        // TODO: task2

        if (input == null) {
            return 0;
        }

        // Convert list to a single string
        StringBuffer sb = new StringBuffer();
        for (String ab : input) {
            sb.append(ab);
            sb.append(" ");
        }
        String str = sb.toString();

        int sum = Arrays.stream(str.split(" |,"))
                .filter(Objects::nonNull)
                .filter((s) -> s.matches("-?\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        return sum;
    }

}
