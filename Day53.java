import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
  
        int angka;
        int total =0;

        System.out.println("Masukkan angka sesuka Anda.");
        System.out.println("Ketik 0 (nol) jika ingin berhenti dan melihat hasil.\n");

        do {
            System.out.print("Masukkan angka: ");
            angka = a.nextInt();
            
            total += angka;

        } while (angka != 0); 

        System.out.println("Total keseluruhan angka adalah: " + total);
        
       
    }
    
}
