import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int total = 0, angka;

        System.out.println("Masukkan angka (negatif untuk berhenti):");
        while (true) {
            angka = a.nextInt();
            if (angka < 0) break;
            total += angka;
        }

        System.out.println("Total: " + total);
      
    }
}
