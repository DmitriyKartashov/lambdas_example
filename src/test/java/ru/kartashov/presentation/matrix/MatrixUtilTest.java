package ru.kartashov.presentation.matrix;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixUtilTest {

    @Test
    public void shouldMultiplyTwoVectors() {
        //given
        int[][] vectorA = {{2, 3}};
        int[][] vectorB = {{4},{5}};

        //when
        int[][] result = MatrixUtil.multiplyMatrices(vectorA, vectorB);

        //then
        int[][] expected = {{8, 15}};
        assertArrayEquals(expected, result);
    }

}