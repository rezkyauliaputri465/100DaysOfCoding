public class Day80 {
    public static void main(String[] args) {

        int[] angka = {12, 45, 23, 89, 34, 67};
        int target = 89;
        int indeksKetemu = -1; 

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == target) {
                indeksKetemu = i; 
                break;            
            }
        }
        if (indeksKetemu != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + indeksKetemu);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan di dalam array.");
        }
    }
}
