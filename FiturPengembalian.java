import java.util.Scanner;
public class FiturPengembalian {

    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        int jumlahBuku;

        System.out.println("===== Fitur Pengembalian Buku =====");
        System.out.print("Masukkan jumlah buku yang akan dikembalikan = ");
        jumlahBuku = input.nextInt();
        input.nextLine();
        System.out.println("====================================================");

        int i = 1;

        while (i <= jumlahBuku) {
            System.out.println("Informasi buku ke-" + i + "=");
            System.out.print("Masukkan judul buku yang akan dikembalikan = ");
            System.out.print("Masukkan penulis buku = ");
            System.out.print("Masukkan tahun terbit buku = ");
            System.out.print("Masukkan tanggal pengembalian : ");
            input.nextLine();
            System.out.println("====================================================");
            i++;
        }
        System.out.println("Terimakasih sudah menggunakan program ini");

        input.close();
    }
}