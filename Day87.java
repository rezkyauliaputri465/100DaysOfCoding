public class Day87 {
    public static void main(String[] args) {

        int[] angka = {12, 29, 88, 45, 55};

        System.out.print("Sebelum dimanipulasi: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < angka.length; i++) {
            angka[i] = angka[i] * 2;
        }

        System.out.print("Sesudah dimanipulasi: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
