import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = a.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka tersebut adalah " + hasil);

    }
}
