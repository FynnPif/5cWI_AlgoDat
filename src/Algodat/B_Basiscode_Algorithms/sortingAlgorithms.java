package Algodat.B_Basiscode_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class sortingAlgorithms {
    public static int[] selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int x = i + 1; x < data.length; x++) {
                if (data[i] > data[x]) {
                    int temp = data[x];
                    data[x] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }
    public static int[] bubbleSort(int[] data) {
        int changes;
        do {
            changes = 0;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                    changes++;
                }
            }
        } while (changes != 0);
        return data;
    }
    public static int[] insertionSort(int[] data) {
        ArrayList<Integer> sorted = new ArrayList<>();
        for (int dataInt : data) {
            for (int i = 0; i < data.length; i++) {
                if (sorted.size() == 0) {
                    sorted.add(dataInt);
                    break;
                }
                if (sorted.get(i) < dataInt) {
                    sorted.add(i, dataInt);
                    break;
                }
            }
        }
        int[] result = new int[sorted.size()];
        int counter = 0;
        for (Integer integer : sorted) {
            result[counter] = integer;
            counter++;
        }
        return result;
    }

    public static void printSelectionSort(int [] data) {
        System.out.println(Arrays.toString(selectionSort(data)));
    }

    public static void printBubbleSort(int [] data) {
        System.out.println(Arrays.toString(bubbleSort(data)));
    }

    public static void printInsertionSort(int [] data) {
        System.out.println(Arrays.toString(insertionSort(data)));
    }
}
