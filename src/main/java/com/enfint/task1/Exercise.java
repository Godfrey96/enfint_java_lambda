package com.enfint.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise {

    public static List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task1

        List<Integer> list = integerList.stream()
                .filter(el -> el != null)
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue().size() == numberOfDuplicates)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return (list == null ? Collections.emptyList() : list);
    }
}
