import java.util.Scanner;
public class ProjekAkhir {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int tanggalPeminjaman, tanggalPengembalian;
    int durasi;
    String namaMahasiswa;

    System.out.println("Masukkan nama peminjam: ");
    namaMahasiswa=input.nextLine();
    System.out.println("Masukkan tanggal peminjaman: ");
    tanggalPeminjaman=input.nextInt();
    System.out.println("Masukkan tanggal pengembalian: ");
    tanggalPengembalian=input.nextInt();
    
    durasi=tanggalPengembalian-tanggalPeminjaman;
    System.out.println(String.format("Durasi Peminjaman: %s hari", durasi));


    

    }
}