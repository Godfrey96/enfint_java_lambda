package com.enfint.task4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.enfint.task4.CharacterType.EVEN;
import static com.enfint.task4.CharacterType.ODD;

public class EvenAndOddFinder {

    static Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO:

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
                            .filter(e -> e != null && !e.isEmpty())
                            .filter(e -> e.length() % 2 == 0)
                            .collect(Collectors.toList()))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());

           oddSet = input.stream()
                    .filter(Objects::nonNull)
                    .map(od -> od.stream()
                            .filter(e -> e != null && !e.isEmpty())
                            .filter(e -> e.length() % 2 != 0)
                            .collect(Collectors.toList()))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());

            oddAndEven.put(CharacterType.ODD, oddSet);
            oddAndEven.put(CharacterType.EVEN, evenSet);
        }

        return oddAndEven;
    }
}
