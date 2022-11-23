package Algodat.C_Algorithmen_u_Datenstrukturen.Search;

public class Search {

        public static int linearSearch(int[] arr, int x){
            for(int j = 0; j < arr.length; j++){
                if(arr[j]==x){
                    return j;
                }
            }
            return -1;
        }

        public static void linearSearchRes(int[] arr, int x){
            int res = linearSearch(arr, x);

            if(res == -1){
                System.out.println("Die eingegebene Zahl befindet sich nicht im Array.");
            } else {
                System.out.println("Die Zahl " + x + " befindet sich an dem Index " + res);
            }
        }


    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 60, 30, 50, 100};
        int x = 30;

        linearSearchRes(arr, x);
    }
}
