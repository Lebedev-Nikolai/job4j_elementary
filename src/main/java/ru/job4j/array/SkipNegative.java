package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    System.out.println("row : " + row + ", cell : " + cell);
                    array[row][cell] = 0;
                }
            }
        }

        return array;
    }
}