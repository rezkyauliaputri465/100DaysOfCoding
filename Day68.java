import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
          Scanner j = new Scanner(System.in);

        System.out.print("Masukkan lebar persegi panjang (jumlah baris): ");
        int lebar = j.nextInt();

        System.out.print("Masukkan panjang persegi panjang (jumlah kolom): ");
        int panjang = j.nextInt();

        System.out.println("\n--- Hasil Pola Persegi Panjang ---");

        for (int i = 1; i <= lebar; i++) {
            
            for (int k = 1; k <= panjang; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

      
    }
    
}
