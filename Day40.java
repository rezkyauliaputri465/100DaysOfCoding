import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("=== Program Cek Suhu Ruangan dengan Konversi ===");
        System.out.println("Pilih satuan suhu yang ingin dimasukkan:");
        System.out.println("1. Celsius (°C)");
        System.out.println("2. Fahrenheit (°F)");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        
        int pilihan = a.nextInt();
        double suhuCelsius = 0;

        if (pilihan == 1) {
            System.out.print("Masukkan nilai suhu dalam Celsius: ");
            suhuCelsius = a.nextDouble();
        } else if (pilihan == 2) {
            System.out.print("Masukkan nilai suhu dalam Fahrenheit: ");
            double suhuFahrenheit = a.nextDouble();
            suhuCelsius = (suhuFahrenheit - 32) * 5.0 / 9.0;
            System.out.printf("Hasil konversi ke Celsius: %.2f°C\n", suhuCelsius);
        } else {
            System.out.println("Pilihan tidak valid! Program dihentikan.");
            a.close();
            return; 
        }
        if (suhuCelsius < 18) {
            System.out.println("Kategori Ruangan: Dingin");
        } else if (suhuCelsius >= 18 && suhuCelsius <= 25) {
            System.out.println("Kategori Ruangan: Sejuk / Nyaman");
        } else if (suhuCelsius > 25 && suhuCelsius <= 30) {
            System.out.println("Kategori Ruangan: Hangat");
        } else {
            System.out.println("Kategori Ruangan: Panas");
        }
        a.close();
    }
}
