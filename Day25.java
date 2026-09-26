import java.util.Scanner;
public class day25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final double PI = 3.14;
        System.out.print("Masukkan jari-jari lingkaran : ");
        String JariJari = in.nextLine();
        double r = Double.parseDouble(JariJari);
        double luasAwal = (PI * r * r * 2);
        double luasAkhir = luasAwal - (luasAwal * 2);
        System.out.printf("Hasil akhir (String): %s%n", String.valueOf(luasAkhir));

        in.close();
    }
}
