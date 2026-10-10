public class Day39 {
    public static void main(String[] args) {
  
        int angka1 = 20;
        int angka2 = 6;
        String operasi = "%";

        if (operasi.equals("+")) {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (operasi.equals("-")) {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (operasi.equals("*")) {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (operasi.equals("/")) {
            System.out.println("Hasil: " + (angka1 / angka2));
        } else if (operasi.equals("%")) {
            System.out.println("Hasil: " + (angka1 % angka2));
        } else {
            System.out.println("Operator tidak tersedia");
        }
    }
}
