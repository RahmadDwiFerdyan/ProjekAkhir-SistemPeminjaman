import java.util.Scanner;
public class FiturPeminjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String judulBuku, penulis;
        int tahunTerbit, jumlahBuku, tanggalPeminjaman;

        System.out.println("===== Fitur Peminjaman Buku =====");
        System.out.print("Masukkan jumlah buku yang akan dipinjam = ");
        jumlahBuku = input.nextInt();
        input.nextLine();
        System.out.println("====================================================");

        int i = 1;

        while (i <= jumlahBuku) {
            System.out.println("Informasi buku ke-" + i + "=");
            System.out.print("Masukkan judul buku yang akan dipinjam = ");
            judulBuku = input.nextLine();
            System.out.print("Masukkan penulis buku = ");
            penulis = input.nextLine();
            System.out.print("Masukkan tahun terbit buku = ");
            tahunTerbit = input.nextInt();
            System.out.print("Masukkan tanggal peminjaman = ");
            tanggalPeminjaman = input.nextInt();
            input.nextLine();
            System.out.println("====================================================");
            i++;
        }
        System.out.println("Terimakasih sudah menggunakan program ini");
    }
}