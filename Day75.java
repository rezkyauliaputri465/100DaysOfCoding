import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat : ");
        String teks = input.nextLine();

        System.out.print("Masukkan kata yang ingin dicari posisinya: ");
        String cariKata = input.nextLine();

        System.out.println("1. Panjang teks (length)            : " + teks.length() + " karakter");
        System.out.println("2. Apakah diawali dengan kata tertentu: " + teks.startsWith(cariKata));
        System.out.println("3. Apakah diakhiri dengan kata tertentu: " + teks.endsWith(cariKata));
        System.out.println("4. Posisi kata ditemukan (indexOf)   : indeks ke-" + teks.indexOf(cariKata));
        System.out.println("5. Apakah teks hanya berisi spasi (isBlank): " + teks.isBlank());
    }
}


