import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan angka untuk dihitung faktorialnya (N): ");
        int n = a.nextInt();

        if (n < 0) {
            System.out.println("Maaf, bilangan faktorial tidak terdefinisi untuk angka negatif.");
        } else {
            long faktorial = 1;

           
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            System.out.println("\nNilai dari " + n + "! (faktorial) adalah: " + faktorial);
        }

       
    }
    
}
