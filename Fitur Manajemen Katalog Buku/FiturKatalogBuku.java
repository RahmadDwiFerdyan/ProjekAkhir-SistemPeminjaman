import java.util.Scanner;

public class FiturKatalogBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku: ");
        int jmlBuku = input.nextInt();
        String [] informasi = {"Nama", "Penulis", "Tahun", "No Induk"};
        String[][] books = new String [jmlBuku][4];

        input.nextLine();

        for (int i = 0; i < books.length; i++) {
            System.out.println("Informasi Buku " + (i+1) + ":");
            for (int j = 0; j < books[i].length; j++) {
                System.out.print(informasi[j] + ": ");
                books[i][j] = input.nextLine();
            }
        }
       System.out.println("\nInformasi Buku: ");
       for ( int i =0; i < books.length; i++) {
        System.out.println("Buku " + (i+1) + ": ");
        for (int j = 0; j < books[i].length; j++ ){
            System.out.println(" - " + books[i][j]);
        }
       }
    }
}
