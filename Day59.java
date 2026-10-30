import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan batas akhir (N): ");
        int n = a.nextInt();

        System.out.print("Masukkan angka kelipatan (M): ");
        int m = a.nextInt();

        System.out.println("Bilangan Kelipatan " + m + " dari 1 sampai " + n );
        
        boolean ditemukan = false;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) { 
                System.out.print(i + " ");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.print("Tidak ada kelipatan " + m + " dalam rentang 1 sampai " + n);
        }
        
        System.out.println(); 
       
    }
    
}
