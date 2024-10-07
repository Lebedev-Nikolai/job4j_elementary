package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int currentIndex = 0; currentIndex < array.length / 2; currentIndex++) {
            int temp = array[currentIndex];

            array[currentIndex] = array[array.length - currentIndex - 1];
            array[array.length - currentIndex - 1] = temp;
        }

        return array;
    }
}
