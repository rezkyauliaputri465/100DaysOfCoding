import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("\nJumlah total angka dari 1 sampai " + n + " adalah: " + total);

       
    }
    
}
