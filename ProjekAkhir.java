import java.util.Scanner;
public class ProjekAkhir {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int tanggalPeminjaman, tanggalPengembalian;
    int durasi;
    System.out.println("Masukkan nama peminjam: ");
    System.out.println("Masukkan tanggal peminjaman: ");
    tanggalPeminjaman=input.nextInt();
    System.out.println("Masukkan tanggal pengembalian: ");
    tanggalPengembalian=input.nextInt();
    
    durasi=tanggalPengembalian-tanggalPeminjaman;
    System.out.println(String.format("Durasi Peminjaman: %s hari", durasi));

    System.out.println("\nMasukkan durasi peminjaman (hari): ");
    durasi=input.nextInt();

    if (durasi>5){
        System.out.println("Dikenakan denda");
    }
    else {
        System.out.println("Tidak dikenakan denda");
    }

    input.close();

    }
}