public class Day30 {
    public static void main(String[] args) {

        int usia = 27;
        System.out.println("Usia yang diperiksa: " + usia + " tahun\n");

        if (usia < 0) {
            System.out.println("Usia tidak benar!");
        } else if (usia <= 14) {
            System.out.println("Kategori: Anak-anak");
        } else if (usia <= 19) {
            System.out.println("Kategori: Remaja");
        } else if (usia <= 40) {
            System.out.println("Kategori: Dewasa");
        } else if (usia <= 59) {
            System.out.println("Kategori: Dewasa Akhir / Paruh Baya");
        } else {
            System.out.println("Kategori: Lansia (60 tahun ke atas)");
        }
    }
}
