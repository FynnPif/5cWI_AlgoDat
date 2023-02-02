package Algodat.B_Basiscode_Algorithms;

import java.util.Arrays;

public class DataGenerator {
    public static int[] generateDataArray(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            long randomInt = Math.round(Math.random()*2147483647);
            arr[i] = (int) randomInt;

        }
        return arr;
    }

    public static int min(int[] data){
        return data[data.length];
    }

    public static int max(int[] data){
        return data[0];
    }

    public static int[] revert(int[] data){
        int[] newArray = new int[data.length];
        
        for(int i = 0; i<data.length; i++){
            newArray[i] = data[data.length - i - 1];
        }
        return newArray;
    }


    public static void printArray(int data) {
        System.out.println(Arrays.toString(generateDataArray(data)));
    }
    public static void printRevert(int[] data) {
        System.out.println(Arrays.toString(revert(data)));
    }
}
