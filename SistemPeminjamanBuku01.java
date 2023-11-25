import java.util.*;
public class SistemPeminjamanBuku01 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayID = {"hamzah02", "Febri11", "Ferdyan20"};
        String[] arrayPW = {"polinema02", "polinema11", "polinema20"};
        String[] namaPeminjam = {"hamzah", "febri", "ferdyan"};
        String[] tanggalPeminjaman = {"12 November", "14 November", "16 November"};
        String[] tanggalPengembalian = {"17 November", "19 November", "21 November"};
        String[] judul = {"SiKancil", "MalinKundang","TimunMas"};
        String[] penulis = {"Budi Hariadi", "Andi Sucipto", "Edo Pratama"};
        String[] tahun = {"2013", "2000", "2004"};

        System.out.println("Selamat Datang di SISTEM PEMINJAMAN BUKU");
        System.out.print("Masukkan ID User: ");
        String userID = input.nextLine();
        System.out.print("Masukkan Password: ");
        char[] passwordArray = input.nextLine().toCharArray();
        String userPW = new String(passwordArray);

        if (fiturLogin(userID, userPW, arrayID, arrayPW)) {
            System.out.println("Login Berhasil !!");
            System.out.println("Selamat, anda telah masuk kedalam fitur kami");
            System.out.println("1. Fitur Pencarian Buku");
            System.out.println("2. Fitur Manajemen Katalog");
            System.out.println("3. Fitur Peminjaman Buku");
            System.out.println("4. Fitur Pengembalian Buku");
            System.out.println("5. Fitur Denda");
            System.out.println("6. Fitur Registrasi Anggota");
            System.out.println("Ketikan angka sesuai dengan fitur yang ingin anda masuki");
            System.out.print("Ketik angka: ");
            int angka = input.nextInt();
            input.nextLine();

            if (angka == 1) {
                System.out.println("Selamat datang didalam Fitur Pencarian Buku");
                String keyJudul;
                System.out.print("Masukkan judul buku : ");
                keyJudul = input.nextLine();
                boolean tersedia = false;
                for (int i=0; i<judul.length; i++ ){
                    if (judul[i].equalsIgnoreCase(keyJudul)){
                        System.out.println("=== Buku Tersedia ===");
                        System.out.println("Judul           : "+judul[i]);
                        System.out.println("Penulis         : "+penulis[i]);
                        System.out.println("Tahun terbit    : "+tahun[i]);
                        tersedia = true;
                        break;
                    } 
                } if (!tersedia){
                    System.out.println("Buku tidak tersedia");
                }
            }

            if (angka == 2) {
                System.out.println("Selamat datang didalam Fitur Manajemen Katalog");
                System.out.print("Masukkan jumlah buku: ");
                int jumlahBuku = input.nextInt();
                String [] informasi = {"Nama Buku", "Penulis Buku", "Tahun Terbit", "No Induk"};
                String[][] books = new String [jumlahBuku][4];
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

            if (angka == 3) {
                System.out.println("Selamat datang didalam Fitur Peminjaman Buku");
                String[] judulBuku1;
                String[] penulis1;
                String[] tanggalPeminjaman1;
                int[] tahunTerbit1;
                int jumlahBuku1;
                System.out.print("Masukkan jumlah buku yang akan dipinjam = ");
                jumlahBuku1 = input.nextInt();
                input.nextLine();
                judulBuku1 = new String[jumlahBuku1];
                penulis1 = new String[jumlahBuku1];
                tahunTerbit1 = new int[jumlahBuku1];
                tanggalPeminjaman1 = new String[jumlahBuku1];
                System.out.println("==============================================");

                for (int i = 0; i < jumlahBuku1; i++) {
                    System.out.println("Buku ke-" + (i + 1));
                    System.out.print("Masukkan judul buku: ");
                    judulBuku1[i] = input.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    penulis1[i] = input.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    tahunTerbit1[i] = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan tanggal peminjaman: ");
                    tanggalPeminjaman1[i] = input.nextLine();
                }
                System.out.println("=============================");
                System.out.println("Buku yang akan dipinjam");
                for (int i = 0; i < jumlahBuku1; i++) {
                    System.out.println("Buku ke-" + (i + 1));
                    System.out.println("Judul Buku: " + judulBuku1[i]);
                    System.out.println("Penulis Buku: " + penulis1[i]);
                    System.out.println("Tahun Terbit Buku: " + tahunTerbit1[i]);
                    System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman1[i]);
                }
                System.out.println("Terimakasih sudah menggunakan program ini");
            }

            if (angka == 4) {
                System.out.println("Selamat datang didalam Fitur Pengembalian Buku");
                String[] judulBuku2;
                String[] penulis2;
                int[] tahunTerbit2;
                int jumlahBuku2;
                String[] tanggalPengembalian2;
                System.out.print("Masukkan jumlah buku yang akan dikembalikan = ");
                jumlahBuku2 = input.nextInt();
                input.nextLine();
                judulBuku2 = new String[jumlahBuku2];
                penulis2 = new String[jumlahBuku2];
                tahunTerbit2 = new int[jumlahBuku2];
                tanggalPengembalian2 = new String[jumlahBuku2];
                System.out.println("==============================================");

                for (int i = 0; i < jumlahBuku2; i++) {
                    System.out.println("Buku ke-" + (i + 1));
                    System.out.print("Masukkan judul buku: ");
                    judulBuku2[i] = input.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    penulis2[i] = input.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    tahunTerbit2[i] = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan tanggal peminjaman: ");
                    tanggalPengembalian2[i] = input.nextLine();
                }
                System.out.println("=============================");
                System.out.println("Buku yang akan dikembalikan: ");
                for (int i = 0; i < jumlahBuku2; i++) {
                    System.out.println("Buku ke-" + (i + 1));
                    System.out.println("Judul Buku: " + judulBuku2[i]);
                    System.out.println("Penulis Buku: " + penulis2[i]);
                    System.out.println("Tahun Terbit Buku: " + tahunTerbit2[i]);
                    System.out.println("Tanggal Peminjaman: " + tanggalPengembalian2[i]);
                }
                System.out.println("Terimakasih sudah menggunakan program ini");
            }

            if (angka == 5) {
                System.out.println("Selamat datang didalam Fitur Denda");

                System.out.println("Data Peminjam = ");
                for (int j = 0; j < namaPeminjam.length; j++) {
                    System.out.println("No " + (j+1) + ". Nama peminjam " + namaPeminjam[j] + "\n Tanggal peminjaman dan pengembalian: " + tanggalPeminjaman[j] + " - " + tanggalPengembalian[j]);
                }
                System.out.print("Masukkan nama: ");
                String peminjam = input.nextLine();
                System.out.print("Masukkan tanggal pengembalian: ");
                int tglKembali = input.nextInt();
                System.out.print("Masukkan tanggal sekarang: ");
                int tglSekarang = input.nextInt();

                if (tglSekarang > tglKembali) {
                    System.out.println("Dikarenakan terlambat dalam  mengembalikan buku yang dipinjam");
                    System.out.println("Atas nama " + peminjam + " akan dikenakan denda sebesar Rp 50.000");
                } else {
                    System.out.println("Dikarenakan tepat waktu dalam mengembalikan buku yang dipinjam");
                    System.out.println("Atas nama " + peminjam + " tidak dikenakan denda");
                }
            }

            if (angka == 6) {
                System.out.println("Selamat datang didalam Fitur Registrasi Anggota");
                System.out.print("Masukkan jumlah anggota: ");
                int jmlAnggota = input.nextInt();
                String[][] anggota = new String [jmlAnggota][4];

                for (int i = 0; i < jmlAnggota; i++) {
                    System.out.println("Masukkan data anggota: " + (i+1) + " : ");
                    System.out.print("Nama: ");
                    anggota[i][0] = input.next();
                    System.out.print("Alamat: ");
                    anggota[i][1] = input.next();
                    System.out.print("Nim: ");
                    anggota[i][2] = input.next();
                    System.out.print("Nomer telepon: ");
                    anggota[i][3] = input.next();
                }
                System.out.println("==================");
                System.out.println("Data anggota: ");
                for (int i = 0; i < jmlAnggota; i++) {
                    System.out.println("Anggota ke- " + (i+1));
                    System.out.println("Nama anggota: " + anggota[i][0]);
                    System.out.println("Alamat rumah: " + anggota[i][1]);
                    System.out.println("NIM: " + anggota[i][2]);
                    System.out.println("No. Telepon: " + anggota[i][3]);
                }
            }

        } else {
            System.out.println("Login gagal. ID User atau Password salah.");
        }
    }
    private static boolean fiturLogin(String userID, String password, String[] arrayID, String[] arrayPW) {
        for (int i = 0; i < arrayID.length; i++) {
            if (userID.equals(arrayID[i]) && password.equals(arrayPW[i])) {
                return true;
            }
        }
        return false;
    }
}
