import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] nilai = new int[4];

        System.out.println("=== Masukkan 4 buah angka ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            nilai[i] = a.nextInt(); 
        }

        System.out.println("\n=== Menampilkan Seluruh Elemen Array ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks [" + i + "] = " + nilai[i]);
        }

    }
    
}
