public class Day83 {
    public static void main(String[] args) {

        int[] angka = {12, 29, 88, 45, 55};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i]; 
        }

    
        System.out.println("Total penjumlahan seluruh elemen array: " + total);
    }
}
