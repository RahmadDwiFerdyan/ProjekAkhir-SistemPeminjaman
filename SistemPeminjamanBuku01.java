import java.util.*;
public class SistemPeminjamanBuku01 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayID = {"hamzah02", "Febri11", "Ferdyan20"};
        String[] arrayPW = {"polinema02", "polinema11", "polinema20"};
        // String[] namaPeminjam = {"hamzah", "febri", "ferdyan"};
        // String[] tanggalPeminjaman = {"12 November", "14 November", "16 November"};
        // String[] tanggalPengembalian = {"17 November", "19 November", "21 November"};

        System.out.println("Selamat Datang di SISTEM PEMINJAMAN BUKU");
        System.out.print("Masukkan ID User: ");
        String userID = input.nextLine();
        System.out.print("Masukkan Password: ");
        char[] passwordArray = input.nextLine().toCharArray();
        String userPW = new String(passwordArray);

        if (fiturLogin(userID, userPW, arrayID, arrayPW)) {
            System.out.println("Login Berhasil !!");
            System.out.println("Selamat, anda telah masuk kedalam fitur kami");
            System.out.println("1. Fitur Pencarian Buku");
            System.out.println("2. Fitur Manajemen Katalog");
            System.out.println("3. Fitur Peminjaman Buku");
            System.out.println("4. Fitur Pengembalian Buku");
            System.out.println("5. Fitur Denda");
            System.out.println("6. Fitur Registrasi Anggota");
            System.out.println("Ketikan angka sesuai dengan fitur yang ingin anda masuki");
            System.out.print("Ketik angka: ");
            int angka = input.nextInt();
            input.nextLine();
            if (angka == 1) {
                System.out.println("Selamat datang didalam Fitur Pencarian Buku");
            }
            if (angka == 2) {
                System.out.println("Selamat datang didalam Fitur Manajemen Katalog");
            }
            if (angka == 3) {
                System.out.println("Selamat datang didalam Fitur Peminjaman Buku");
            }
            if (angka == 4) {
                System.out.println("Selamat datang didalam Fitur Pengembalian Buku");
            }
            if (angka == 5) {
                System.out.println("Selamat datang didalam Fitur Denda");
                // identitasPeminjam();

                System.out.print("Masukkan nama: ");
                String peminjam = input.nextLine();
                System.out.print("Masukkan tanggal pengembalian: ");
                int tglKembali = input.nextInt();
                System.out.print("Masukkan tanggal sekarang: ");
                int tglSekarang = input.nextInt();

                if (tglSekarang > tglKembali) {
                    System.out.println("Dikarenakan terlambat dalam  mengembalikan buku yang dipinjam");
                    System.out.println("Atas nama " + peminjam + " akan dikenakan denda sebesar Rp 50.000");
                } else {
                    System.out.println("Dikarenakan tepat waktu dalam mengembalikan buku yang dipinjam");
                    System.out.println("Atas nama " + peminjam + " tidak dikenakan denda");
                }
            }
            if (angka == 6) {
                System.out.println("Selamat datang didalam Fitur Registrasi Anggota");
            }
        } else {
            System.out.println("Login gagal. ID User atau Password salah.");
        }
    }
    private static boolean fiturLogin(String userID, String password, String[] arrayID, String[] arrayPW) {
        for (int i = 0; i < arrayID.length; i++) {
            if (userID.equals(arrayID[i]) && password.equals(arrayPW[i])) {
                return true;
            }
        }
        return false;
    }
    // static void identitasPeminjam() {
    //    System.out.println("Data Peminjam");
    //    for (int i = 0; i < namaPeminjam.length; i++) {
    //        System.out.println("No " + (i+1) + ". Nama peminjam " + namaPeminjam[i] + "\n Tanggal peminjaman dan pengembalian: " + tanggalPeminjaman[i] + " - " + tanggalPengembalian[i]);
    //    }
    // }
}