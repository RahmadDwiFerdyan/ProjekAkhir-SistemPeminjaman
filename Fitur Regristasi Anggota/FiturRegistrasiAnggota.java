import java.util.Scanner;
public class FiturRegistrasiAnggota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di dalam fitur Registrasi Anggota");
        System.out.print("Masukkan nama anggota = ");
        String namaAnggota = input.nextLine();
        System.out.print("Masukkan email anggota = ");
        String emailAnggota = input.nextLine();
        System.out.print("Masukkan password anggota = ");
        String passwordAnggota = input.nextLine();

        System.out.println("Registrasi berhasil !");
        System.out.println("Data Anggota:");
        System.out.println("Nama Anggota = " + namaAnggota);
        System.out.println("Email Anggota = " + emailAnggota);
        System.out.println("Password Anggota = " + passwordAnggota);

    }
}