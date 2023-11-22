import java.util.Scanner;
public class FiturLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayID = {"hamzah02", "Febri11", "Ferdyan20"};
        String[] arrayPW = {"polinema02", "polinema11", "polinema20"};

        System.out.println("Selamat Datang didalam |SISTEM PEMINJAMAN BUKU|");
        System.out.print("Masukkan ID User: ");
        String userID = input.nextLine();
        System.out.print("Masukkan Password: ");
        char[] passwordArray = input.nextLine().toCharArray();
        String userPW = new String(passwordArray);

        // Memeriksa ID pengguna dan password
        if (fiturLogin(userID, userPW, arrayID, arrayPW)) {
            System.out.println("Login Berhasil !!");
        } else {
            System.out.println("Login gagal. ID User atau Password salah.");
        }
    }

    // Fungsi untuk memeriksa ID pengguna dan password
    private static boolean fiturLogin(String userID, String password, String[] arrayID, String[] arrayPW) {
        for (int i = 0; i < arrayID.length; i++) {
            if (userID.equals(arrayID[i]) && password.equals(arrayPW[i])) {
                return true;
            }
        }
        return false;
    }
}
