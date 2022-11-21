package com.enfint.task2;

import java.util.*;

public class ListOperation {

    public static int integerSum(List<String> input) {

        if (input == null) {
            return 0;
        }

        int sum = Arrays.stream(String.join(" ", input).split(" |,"))
                .filter(Objects::nonNull)
                .filter((s) -> s.matches("-?\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        return sum;
    }

}
