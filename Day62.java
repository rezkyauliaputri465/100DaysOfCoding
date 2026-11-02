import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
 
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi =a.nextInt();

        System.out.println(" Hasil Pola Segitiga :");

        for (int i = 1; i <= tinggi; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

      
}
    }
