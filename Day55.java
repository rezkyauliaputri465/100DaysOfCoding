public class Day55 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println("Angka: " + i);
        }
        
        cekNilai(8);
    }

    public static void cekNilai(int nilai) {
        if (nilai > 5) {
            return;
        }
        System.out.println("Nilai kurang dari atau sama dengan 5");
    }
}
