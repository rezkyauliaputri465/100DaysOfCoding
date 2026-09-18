import java.util.Scanner;

	public class day17 {
   	 public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
            System.out.print("Masukkan angka awal: ");
        int angka = a.nextInt();

        angka += 10;
        System.out.println("Setelah += 15: " + angka);

        angka -= 5;
        System.out.println("Setelah -= 7: " + angka);

        angka *= 2;
        System.out.println("Setelah *= 6: " + angka);

        angka /= 3;
        System.out.println("Setelah /= 9: " + angka);

        angka %= 4;
        System.out.println("Setelah %= 4: " + angka);

        a.close();
        
    }
}
