import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        //Soal 1 ICL
        double alas = a.nextDouble();
        double tinggi = a.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println(luas);
}
}
