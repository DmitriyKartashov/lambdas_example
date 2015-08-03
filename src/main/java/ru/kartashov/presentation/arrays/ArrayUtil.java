package ru.kartashov.presentation.arrays;

/**
 * @author Dmitrii Kartashov
 */
public class ArrayUtil {

    public static int[][] createIntArray(int x, int y)
    {
        return new int[x][y];
    }

    public static void fillWithZeros(int[][] array)
    {
        for (int[] inArray : array)
        {
            for (int i = 0; i < inArray.length; i++) {
                inArray[i] = 0;
            }
        }
    }


}
