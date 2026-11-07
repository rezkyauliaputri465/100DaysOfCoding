import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi persegi (N): ");
        int n = a.nextInt();

        System.out.println("\n Hasil Pola Persegi " + n + " x " + n + " ");

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

       
    }
    
}
