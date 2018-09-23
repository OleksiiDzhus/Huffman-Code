package com.joske.training.utils;

import static java.util.stream.Collectors.toMap;

import java.util.Map;

public class StringUtil {

  public static Map<Character, Integer> countCharOccurences(String string) {
    return string.chars()
        .boxed()
        .collect(toMap(
            k -> (char) k.intValue(),
            v -> 1,
            Integer::sum));
  }
}
