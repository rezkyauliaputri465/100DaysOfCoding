import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner a  = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println("Angka Ganjil (" + n + " turun ke 1) ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Angka Genap (" + n + " turun ke 1) ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }
        System.out.println();

       
    }
    
}
