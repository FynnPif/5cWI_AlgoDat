package Algodat.C_Algorithmen_u_Datenstrukturen.Search;

public class search {
    public static int sequentialSearch(int arr[], int x){
        for(int j = 0; j < arr.length; j++){
            if(arr[j]==x){
                return j;
            }
        }
        return -1;
    }

    public static void sequentialSearchResult(int arr[], int x){
        int res = sequentialSearch(arr, x);

        if(res == -1){
            System.out.println("Die eingegebene Zahl befindet sich nicht im Array.");
        } else {
            System.out.println("Die Zahl " + x + " befindet sich an dem Index " + res);
        }
    }

    //insertion sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int binarySearch(int arr[], int x){
        sort(arr);
        int count = 1;
        for(int j = 0; j < count; j++){
            if(arr[j]==x){
                return j;
            }
            count++;
        }
        return -1;
    }
    //implement binarysearch
}
