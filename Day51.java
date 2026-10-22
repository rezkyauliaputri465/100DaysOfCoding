import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("Masukkan angka yang ingin dihitung faktorialnya: ");
        int n = a.nextInt();
        
        long faktorial = 1;
        
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
        }
        System.out.println("Nilai faktorial dari " + n + "! adalah: " + faktorial);

    }
}
