import java.util.Scanner;
public class FiturPengembalian {

    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        String judulBuku, penulis;
        int tahunTerbit, jumlahBuku;

        System.out.println("===== Fitur Pengembalian Buku =====");
        System.out.print("Masukkan jumlah buku yang akan dikembalikan = ");
        jumlahBuku = input.nextInt();
        input.nextLine();
        System.out.println("====================================================");

        int i = 0;

        while (i < jumlahBuku) {
            System.out.print("Masukkan judul buku yang akan dikembalikan = ");
            judulBuku = input.nextLine();
            System.out.print("Masukkan penulis buku = ");
            penulis = input.nextLine();
            System.out.print("Masukkan tahun terbit buku = ");
            tahunTerbit = input.nextInt();
            input.nextLine();
            System.out.println("====================================================");
            i++;
        }
        System.out.println("Terimakasih sudah menggunakan program ini");
    }
}