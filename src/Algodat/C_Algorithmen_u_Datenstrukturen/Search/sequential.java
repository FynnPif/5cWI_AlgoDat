package Algodat.C_Algorithmen_u_Datenstrukturen.Search;

public class sequential {
    public static int sequentialSearch(int[] arr, int x){
        for(int j = 0; j < arr.length; j++){
            if(arr[j]==x){
                return j;
            }
        }
        return -1;
    }

    public static void sequentialSearchResult(int[] arr, int x){
        int res = sequentialSearch(arr, x);

        if(res == -1){
            System.out.println("Die eingegebene Zahl befindet sich nicht im Array.");
        } else {
            System.out.println("Die Zahl " + x + " befindet sich an dem Index " + res);
        }
    }
}
