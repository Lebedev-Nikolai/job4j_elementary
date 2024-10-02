package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int lastIndex = array.length - 1;

        for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {
            int temp = array[currentIndex];
            array[currentIndex] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;
        }

        return array;
    }
}
