import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang garis horizontal (N): ");
        int n = in.nextInt();

        System.out.println("\n Hasil Pola Garis Horizontal ");

        for (int i = 1; i <= n; i++) {
            System.out.print("-");
        }
        
        System.out.println(); 
    }
}
