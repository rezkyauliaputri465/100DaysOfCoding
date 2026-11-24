public class Day84 {
    public static void main(String[] args) {

        int[] angka = {12, 29, 88, 45, 55};

        int maks = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maks) {
                maks = angka[i];
            }
        }

        System.out.println("Angka maksimal di dalam array adalah: " + maks);
    }
}
