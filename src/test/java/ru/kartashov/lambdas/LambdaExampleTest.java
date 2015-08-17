package ru.kartashov.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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


}