import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran baju (S / M / L / XL): ");
        String ukuran = in.next().toUpperCase();

        switch (ukuran) {
            case "S":
                System.out.println("Kategori: Small (Kecil)");
                break;
            case "M":
                System.out.println("Kategori: Medium (Sedang)");
                break;
            case "L":
                System.out.println("Kategori: Large (Besar)");
                break;
            case "XL":
                System.out.println("Kategori: Extra Large (Sangat Besar)");
                break;
            default:
                System.out.println("Maaf, ukuran tidak dikenali.");
                break;


        }

    }
}
