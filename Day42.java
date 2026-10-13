import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Nama Karyawan : ");
        String nama =a.nextLine();

        System.out.print("Masukkan Gaji Pokok    : Rp ");
        double gajiPokok = a.nextDouble();

        System.out.print("Masukkan Tunjangan     : Rp ");
        double tunjangan = a.nextDouble();

        System.out.print("Masukkan Total Potongan: Rp ");
        double potongan = a.nextDouble();

        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih = gajiKotor - potongan;

        System.out.println("Nama Karyawan    : " + nama);
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan        : Rp " + tunjangan);
        System.out.println("Gaji Kotor       : Rp " + gajiKotor);
        System.out.println("Potongan         : Rp " + potongan);
        System.out.println("GAJI BERSIH      : Rp " + gajiBersih);
 
    }
}
