import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = a.nextInt();

        angka++; 
 
        System.out.println("Setelah increment (++) : " + angka);

        angka--; 
        System.out.println("Setelah decrement (--) : " + angka);
    }
}
