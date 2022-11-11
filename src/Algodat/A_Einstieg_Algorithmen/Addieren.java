package Algodat.A_Einstieg_Algorithmen;

import java.util.Scanner;

public class Addieren {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char zahl1[] = scan.nextLine().toCharArray();
        char zahl2[] = scan.nextLine().toCharArray();
        //int result[] = new int[];


        String res = "";
        int remember = 0;
        for(int i = zahl1.length - 1;i >= 0 ; i--){
            int sum = Character.getNumericValue(zahl1[i]) + Character.getNumericValue(zahl2[i]) + remember;
            remember = sum / 10;
            sum = sum % 10;
            res = sum + res;
            if(i == 0){
                res = sum + res;
            }
        }
        System.out.println(res);
    }
}
