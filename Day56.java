import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = a.nextInt();

        System.out.println("Angka Genap 1 s.d " + n + " (Naik)");
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        System.out.println(" Angka Genap " + n + " s.d 1 (Turun)");
        int j = n;
        while (j >= 1) {
            if (j % 2 == 0) { 
                System.out.print(j + " ");
            }
            j--;
        }
        System.out.println();

    }
    
}
