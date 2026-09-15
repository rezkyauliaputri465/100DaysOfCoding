import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print(" Angka Pertama : ");
        int ang1 = a.nextInt();
        System.out.print(" Angka Kedua : ");
        int ang2 = a.nextInt();

        int hasilPenjumlahan = ang1 + ang2;
        int hasilPengurangan = ang1 - ang2;

        System.out.println("Penjumlahan(" + ang1 + " +  "+ ang2 + "): " + hasilPenjumlahan);
        System.out.println("Pengurangan(" + ang1 + " -  "+ ang2 + "): " + hasilPengurangan);

        a.close();

    }
    
}
