import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] angka = {12, 29, 88, 45, 55};
        
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Angka " + cari + " tidak ditemukan di dalam array.");
        }

    }
    
}
