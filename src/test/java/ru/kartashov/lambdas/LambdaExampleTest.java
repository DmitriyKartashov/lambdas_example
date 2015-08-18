package ru.kartashov.lambdas;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LambdaExampleTest {

    private LambdaExample lambdaExample = new LambdaExample();

    @Test
    public void shouldTestHappyPass() {
        //given
        List<String> list = Arrays.asList("aa", "acc", "a");

        //when
        String foundValue = lambdaExample.findLongestStringStartsWithA(list);

        //then
        assertEquals("acc", foundValue);
    }

    @Test
    public void shouldTestHappyPassJ7() {
        //given
        List<String> list = Arrays.asList("aa", "acc", "a");

        //when
        String foundValue = lambdaExample.findLongestStringStartsWithAJ7(list);

        //then
        assertEquals("acc", foundValue);
    }
}
