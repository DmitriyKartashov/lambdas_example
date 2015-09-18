package ru.kartashov.lambdas;

import java.util.List;

public class LambdaExample {
    public String findLongestStringStartsWithA(List<String> stringList)
    {
        return stringList.stream()
            .filter(s -> s.startsWith("a"))
            .max((s1, s2) -> s1.length() - s2.length())
            .orElse("no match");
    }

    public String findLongestStringStartsWithAJ7(List<String> stringList)
    {
        String longest = "";
        for (String s : stringList)
        {
            if (s.startsWith("a"))
            {
                if (s.length() > longest.length())
                {
                    longest = s;
                }
            }
        }
        return longest.isEmpty() ? "no match" : longest;
    }
}
