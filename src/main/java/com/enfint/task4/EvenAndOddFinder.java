package com.enfint.task4;

import java.util.*;

import static com.enfint.task4.CharacterType.EVEN;
import static com.enfint.task4.CharacterType.ODD;

public class EvenAndOddFinder {

    static Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4

        List<String> newList = new ArrayList<>();

        for (Set<String> outerList : input) {
            for (String innerList : outerList) {
                newList.add(innerList);
            }
        }

        Set<String> even = new HashSet<>();
        Set<String> odd = new HashSet<>();

        for (String list : newList) {
            CharacterType characterType = list.length() % 2 == 0 ? EVEN : ODD;
            if (characterType.equals(EVEN)) {
                even.add(list);
            } else {
                odd.add(list);
            }
        }

        Map<CharacterType, Set<String>> hi = new HashMap<>();
        hi.put(EVEN, even);
        hi.put(ODD, odd);

        System.out.println(hi);

        return new HashMap<>();
    }
}
