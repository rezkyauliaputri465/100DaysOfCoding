import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n =a.nextInt();

        long hasilKali = 1;

        for (int i = 1; i <= n; i++) {
            hasilKali *= i;
        }

        System.out.println("\nHasil perkalian (faktorial) dari 1 sampai " + n + " adalah: " + hasilKali);

       
    }
    
}
