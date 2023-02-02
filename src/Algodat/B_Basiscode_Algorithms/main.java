package Algodat.B_Basiscode_Algorithms;

public class main {
    public static void main(String[] args) {
        int[] data = {1,5,8,0,3,4};

        DataGenerator.printArray(5);
        DataGenerator.printRevert(data);

        sortingAlgorithms.printSelectionSort(data);
        sortingAlgorithms.printBubbleSort(data);
        sortingAlgorithms.printInsertionSort(data);


    }
}
