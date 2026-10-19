import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = l.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = l.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = l.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Tidak bisa membagi dengan nol!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

  
    }
}
