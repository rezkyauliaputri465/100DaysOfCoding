import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("=== BIODATA AULIA ===");

        System.out.print("Nama              : ");
        String nama = inp.nextLine();

        System.out.print("NIM               : ");
        String nim = inp.nextLine();

        System.out.print("Umur              : ");
        int umur = inp.nextInt();

        System.out.print("Tinggi Badan      : ");
        double tinggi = inp.nextDouble();

        System.out.print("Jenis Kelamin     : ");
        char Jk = inp.next().charAt(0);


        System.out.println("\n=== HASIL BIODATA ===");
        System.out.println("Nama             : " + nama);
        System.out.println("NIM              : " + nim);
        System.out.println("Umur             : " + umur + " tahun");
        System.out.println("Tinggi Badan     : " + tinggi + " cm");
        System.out.println("Jenis Kelamin    : " + Jk);
       

        inp.close();
    }
}

