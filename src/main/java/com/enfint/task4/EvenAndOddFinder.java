package com.enfint.task4;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndOddFinder {

    static Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {

        Map<CharacterType, Set<String>> oddAndEven = new HashMap<>();

        Set<String> evenSet = new HashSet<>();
        Set<String> oddSet = new HashSet<>();

        if (input == null) {
            oddAndEven.put(CharacterType.ODD, oddSet);
            oddAndEven.put(CharacterType.EVEN, evenSet);
        }
        if (input != null){
            evenSet = input.stream()
                    .filter(Objects::nonNull)
                    .map(ev -> ev.stream()
                            .filter(e -> e != null && !e.isEmpty() && e.length() % 2 == 0)
                            .collect(Collectors.toList()))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());

           oddSet = input.stream()
                    .filter(Objects::nonNull)
                    .map(od -> od.stream()
                            .filter(e -> e != null && !e.isEmpty() && e.length() % 2 != 0)
                            .collect(Collectors.toList()))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());

            oddAndEven.put(CharacterType.ODD, oddSet);
            oddAndEven.put(CharacterType.EVEN, evenSet);
        }

        return oddAndEven;
    }
}
