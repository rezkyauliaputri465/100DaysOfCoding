import java.util.Scanner;

public class Day69{
    public static void main(String[] args) {
          Scanner j = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga siku-siku: ");
        int tinggi = j.nextInt();

        System.out.println("\n Hasil Pola Segitiga Siku-Siku ");

        for (int i = 1; i <= tinggi; i++) {
            
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

    }
    
}
