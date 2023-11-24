import java.util.Scanner;
public class FiturDenda {
    static String[] namaPeminjam = {"hamzah", "febri", "ferdyan"};
    static String[] tanggalPeminjaman = {"12 November", "14 November", "16 November"};
    static String[] tanggalPengembalian = {"17 November", "19 November", "21 November"};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di dalam Fitur Denda");

        identitasPeminjam();

        System.out.print("Masukkan nama: ");
        String peminjam = input.nextLine();
        System.out.print("Masukkan tanggal pengembalian: ");
        int tglKembali = input.nextInt();
        System.out.print("Masukkan tanggal sekarang: ");
        int tglSekarang = input.nextInt();

        if (tglSekarang > tglKembali) {
            System.out.println("Atas nama " + peminjam + " akan dikenakan denda sebesar Rp 50.000");
        } else {
            System.out.println("Atas nama " + peminjam + " tidak dikenakan denda");
        }
     
    }
    static void identitasPeminjam() {
        System.out.println("Data Peminjam");
        for (int i = 0; i < namaPeminjam.length; i++) {
            System.out.println("No " + (i+1) + ". Nama peminjam " + namaPeminjam[i] + "\n Tanggal peminjaman dan pengembalian: " + tanggalPeminjaman[i] + " - " + tanggalPengembalian[i]);
        }
    }
}
