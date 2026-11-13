import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n1. Menu 1\n2. Menu 2\n3. Keluar");
            System.out.print("Pilih: ");
            pilih = a.nextInt();

            if (pilih == 1) System.out.println("-> Menu 1 dipilih");
            else if (pilih == 2) System.out.println("-> Menu 2 dipilih");
            else if (pilih == 3) System.out.println("-> Keluar");
            else System.out.println("-> Tidak valid");
            
        } while (pilih != 3);

    }
}
