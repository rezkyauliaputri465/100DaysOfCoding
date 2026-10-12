import java.util.Scanner;
public class eval2 {
    public static void main(String[] args) {
        Scanner a = new  Scanner(System.in);

        System.out.print("Masukkan angka :");
        double ang = a.nextDouble();
        
        if (ang % 1 == 0) { 
            if (ang % 5 == 0) {
                System.out.println("Bilangan Bulat - Kelipatan 5");
            }else{
                System.out.println("Bilangan Bulat - Bukan Kelipatan 5");
            }
        }else{
           System.out.println("Bilangan desimal");
        }
        
    }
}
