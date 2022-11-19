package com.enfint.task3;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FindTheMaximumElements {

    public static List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3

         if (input == null) {
            return Collections.emptyList();
         }

        return input.stream()
                .filter(Objects::nonNull)
                .sorted((a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)))
                .limit(3)
                .map(BigDecimal::new)
                .collect(Collectors.toList());

    }

}
