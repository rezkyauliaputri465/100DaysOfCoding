public class Day77 {
    public static void main(String[] args) {

        String teks = "  Belajar Java  ".trim();

        System.out.println("Panjang   : " + teks.length());
        System.out.println("Kapital   : " + teks.toUpperCase());
        System.out.println("Karakter  : " + teks.charAt(3));
        System.out.println("Potong    : " + teks.substring(8));
        System.out.println("Ganti     : " + teks.replace("Java", "Kotlin"));
        System.out.println("Ada 'Java': " + teks.contains("Java"));
    }
}
