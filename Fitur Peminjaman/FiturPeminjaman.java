import java.util.Scanner;
public class FiturPeminjaman {
    static Scanner input = new Scanner(System.in);
    static String[] judulBuku;
    static String[] penulis;
    static int[] tahunTerbit;
    static int jumlahBuku;
    public static void main(String[] args) {
        System.out.println("===== Fitur Peminjaman Buku =====");
        System.out.print("Masukkan jumlah buku yang akan dipinjam = ");
        jumlahBuku = input.nextInt();
        input.nextLine();
        judulBuku = new String[jumlahBuku];
        penulis = new String[jumlahBuku];
        tahunTerbit = new int[jumlahBuku];
        System.out.println("====================================================");
        dataBuku();
        System.out.println("Terimakasih sudah menggunakan program ini");
    }
    static void dataBuku() {
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ke- " + (i+1));
            System.out.print("Masukkan judul buku yang akan dipinjam: ");
            judulBuku[i] = input.nextLine();
            System.out.print("Masukkan penulis buku: ");
            penulis[i] = input.nextLine();
            System.out.print("Masukkan tahun terbit buku: ");
            tahunTerbit[i] = input.nextInt();
            input.nextLine();
        }
    }
}
