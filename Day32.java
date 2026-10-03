public class Day32 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Perbandingan: " + (a > b));
        System.out.println("AND: " + (a > b && b > c));
        System.out.println("OR: " + (a < b || b > c));
        System.out.println("NOT: " + !(a > b));
    }
}
