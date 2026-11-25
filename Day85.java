public class Day85 {
    public static void main(String[] args) {

        int[] angka = {12, 29, 88, 45, 55};
        int min = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        System.out.println("Angka minimal di dalam array adalah: " + min);
    }
}
