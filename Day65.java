import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.print("Masukkan panjang garis vertikal (N): ");
        int n =j.nextInt();

        System.out.println("\n--- Hasil Pola Garis Vertikal ---");

      
        for (int i = 1; i <= n; i++) {
            System.out.println("|");
        }

        
    }
    
}
