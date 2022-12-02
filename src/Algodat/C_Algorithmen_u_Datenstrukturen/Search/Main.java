package Algodat.C_Algorithmen_u_Datenstrukturen.Search;

public class Main extends search {

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 60, 30, 50, 100};
        int x = 100;

        sequentialSearchResult(arr, x);

        System.out.println(binarySearch(arr, x));

    }
}
