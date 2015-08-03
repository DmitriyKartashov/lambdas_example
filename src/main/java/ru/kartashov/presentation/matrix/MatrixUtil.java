package ru.kartashov.presentation.matrix;

import static ru.kartashov.presentation.arrays.ArrayUtil.createIntArray;
import static ru.kartashov.presentation.arrays.ArrayUtil.fillWithZeros;

/**
 * @author Dmitrii Kartashov
 */
public class MatrixUtil {

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int x = a.length;
        int y = a[0].length;
        int[][] result = createIntArray(x, y);
        fillWithZeros(result);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                result[i][j] += (a[i][j] * b[j][i]);
        }
        return result;
    }
}
