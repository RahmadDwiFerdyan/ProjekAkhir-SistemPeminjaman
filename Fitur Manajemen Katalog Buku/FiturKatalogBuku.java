import java.util.Scanner;

public class FiturKatalogBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku: ");
        int jmlBuku = input.nextInt();
        String[][] buku = new String [jmlBuku][4];

        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("Masukkan data buku " + (i+1) + " : ");
            System.out.print("Judul Buku: ");
            buku[i][0] = input.next();
            System.out.print("Penulis Buku: ");
            buku[i][1] = input.next();
            System.out.print("Tahun Terbit: ");
            buku[i][2] = input.next();
            System.out.print("Nomor Induk Buku: ");
            buku[i][3] = input.next();
        }
        System.out.println("Data buku: ");
        System.out.println("Buku" + "\t" + "Judul Buku" + "\t" + "Penulis Buku" + "\t" + " Tahun Terbit" + "\t" + "Nomor Induk Buku");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println((i+1) + "\t" + buku[i][0] + "\t" + buku[i][1] + "\t" + buku[i][2] + "\t" + buku[i][3]);
        }
    }
}
