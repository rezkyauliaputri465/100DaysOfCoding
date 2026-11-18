import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        String userRegistrasi = "admin";
        String passRegistrasi = "12345";

        int kesempatan = 3;
        boolean statusLogin = false;

        System.out.println("=== SILAKAN LOGIN (Maksimal 3 kali percobaan) ===");

        do {
            System.out.print("\nUsername: ");
            String inputUser = a.nextLine();
            System.out.print("Password: ");
            String inputPass = a.nextLine();

            if (inputUser.equals(userRegistrasi) && inputPass.equals(passRegistrasi)) {
                statusLogin = true;
                break;
            } else {
                kesempatan--;
                System.out.println("Login Gagal! Sisa kesempatan: " + kesempatan);
            }

        } while (kesempatan > 0);

        if (statusLogin) {
            System.out.println("\nLogin Berhasil! Selamat datang.");
        } else {
            System.out.println("\nAkun Anda diblokir karena salah 3 kali.");
        }

    }
}
