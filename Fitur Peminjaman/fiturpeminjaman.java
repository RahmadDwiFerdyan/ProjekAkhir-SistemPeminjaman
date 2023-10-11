import java.util.Scanner;
public class fiturpeminjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBuku, konfirmasi;
        System.out.print("Masukkan nama buku: ");
        namaBuku = input.nextLine();

        do {
            System.out.print("Apakah anda ingin pinjam buku lagi (y/t)");
            konfirmasi = input.nextLine();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("");
            }
        }
    }
}