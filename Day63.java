import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nilai basis (M): ");
        int m =a.nextInt();

        System.out.print("Masukkan nilai pangkat (N): ");
        int n =a.nextInt();

        long hasilPangkat = 1;

        for (int i = 1; i <= n; i++) {
            hasilPangkat *= m; 
        }

        System.out.println("\nHasil dari " + m + " pangkat " + n + " (" + m + "^" + n + ") adalah: " + hasilPangkat);

       
    }
    
}
