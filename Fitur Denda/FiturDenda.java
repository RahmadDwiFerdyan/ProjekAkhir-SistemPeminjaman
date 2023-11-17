import java.util.Scanner;
public class FiturDenda {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
    int durasi;
    System.out.println("Masukkan identitas peminjam");
    System.out.print("Nama: ");
    String nama = input.nextLine();
    System.out.print("Tanggal lahir: ");
    String tanggalLahir = input.nextLine();
    System.out.print("Alamat rumah: ");
    String alamat = input.nextLine();
    System.out.print("No. Telepon: ");
    String telepon = input.nextLine();
    System.out.print("\nMasukkan tanggal peminjaman (hari): ");
    int tanggalPeminjaman = input.nextInt();
    System.out.print("Masukkan tanggal pengembalian (hari): ");
    int tanggalPengembalian = input.nextInt();
    System.out.println("Durasi: " + tanggalPengembalian + " - " + tanggalPeminjaman);
    durasi = tanggalPengembalian - tanggalPeminjaman;
    System.out.println("Durasi: " + durasi + " (hari)");
    if (durasi>5){
        System.out.println("Dikenakan denda");
    }
    else {
        System.out.println("Tidak dikenakan denda");
    }
  }
}
