import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long hasil = 1;

        if (n < 0) {
            System.out.println("Tidak terdefinisi");
        } else {
            for (int i = 1; i <= n; i++) {
                hasil *= i;
            }
            System.out.println(hasil);
        }
    }
}
  
