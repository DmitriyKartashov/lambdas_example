package ru.kartashov.lambdas;

import java.util.List;

/**
 * @author Dmitrii Kartashov
 */
public class LambdaExample {
    public String findLongestStringStartsWithA(List<String> stringList)
    {
        return stringList.stream()
            .filter(s -> s.startsWith("a"))
            .min((s1, s2) -> s2.length() - s1.length())
            .orElse("no match");
    }
}
