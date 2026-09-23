public class Day22 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Sebelum ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Setelah ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
    }
}
