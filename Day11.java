import java.util.Scanner;
public class day11 {
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        byte umur = inp.nextByte();
        short tahunLahir = inp.nextShort();
        int uang = inp.nextInt();
        long nomor = inp.nextLong();
        float tinggi = inp.nextFloat();
        double berat = inp.nextDouble();
        char jenisKelamin = inp.next().charAt(0);
        boolean sudahMakan = inp.nextBoolean();
        String nama = inp.next();

        System.out.print("Nama: " + nama);
        System.out.print("Umur: " + umur);
        System.out.print("Tahun Lahir: " + tahunLahir);
        System.out.print("Uang: Rp" + uang);
        System.out.print("Nomor: " + nomor);
        System.out.print("Tinggi: " + tinggi + " cm");
        System.out.print("Berat: " + berat + " kg");
        System.out.print("Jenis Kelamin: " + jenisKelamin);
        System.out.print("Sudah Makan: " + sudahMakan);

        inp.close();
        /*  Scanner inp = new Scanner(System.in);adalah sebuah class
        yang memungkinkan kita untuk input langsung*/
        //inp,close() menutup Scanner setelah selesai digunakan.
    }
}
