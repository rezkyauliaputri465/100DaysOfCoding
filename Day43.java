import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
      Scanner a = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = a.nextInt();
       
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 3 DAN 5.");
        } 
        else if (angka % 3 == 0) {
            System.out.println(angka + " adalah kelipatan 3.");
        } 
        else if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 5.");
        } 
        else {
            System.out.println(angka + " BUKAN kelipatan 3 maupun 5.");
        }

    }
}
