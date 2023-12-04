import java.util.Scanner;

public class SistemPeminjamanBuku01 {

    public static boolean fiturLogin(String userID, String password, String[] arrayID, String[] arrayPW) {
        for (int i = 0; i < arrayID.length; i++) {
            if (userID.equals(arrayID[i]) && password.equals(arrayPW[i])) {
                return true;
            }
        }
        return false;
    }
    public static int indeksAnggota(String[][] anggota) {
        for (int j = 0; j < anggota.length; j++) {
            if (anggota[j][0] == null) {
                return j;
            }
        }
        return -1; 
    }

    public static String[][] dataAnggota(String[][] anggota, int j) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data anggota: ");
        System.out.print("Nama: ");
        anggota[j][0] = input.next();
        System.out.print("NIM: ");
        anggota[j][1] = input.next();
        System.out.print("Alamat: ");
        anggota[j][2] = input.next();
        System.out.print("No. Telepon: ");
        anggota[j][3] = input.next();

        return anggota;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayID = {"hamzah02", "Febri11", "Ferdyan20"};
        String[] arrayPW = {"polinema02", "polinema11", "polinema20"};
        String[] namaPeminjam = {"amzah", "febri", "ferdyan"};
        String[] tanggalPeminjaman = {"12 November", "14 November", "16 November"};
        String[] tanggalPengembalian = {"17 November", "19 November", "21 November"};
        String[] judul = {"Si Kancil", "Malin Kundang", "Timun Mas"};
        String[] penulis = {"Budi Hariadi", "Andi Sucipto", "Edo Pratama"};
        String[] tahun = {"2013", "2000", "2004"};
        String[][] anggota = new String [10][4];
            anggota[0][0] = "Rahmad Dwi Ferdyan";
            anggota[0][1] = "2341720122";
            anggota[0][2] = "Malang";
            anggota[0][3] = "08123456789";

        System.out.println("\n* Selamat Datang di dalam | SISTEM PEMINJAMAN BUKU | *");
        boolean berhasilLogin = false;

        do {
            System.out.println("\n|Login|");
            System.out.print("Masukkan ID User: ");
            String userID = input.nextLine();
            System.out.print("Masukkan Password: ");
            char[] passwordArray = input.nextLine().toCharArray();
            String userPW = new String(passwordArray);

            berhasilLogin = fiturLogin(userID, userPW, arrayID, arrayPW);

            if (berhasilLogin) {

            char konfirmasi;
            do{
                System.out.println("\nLogin Berhasil!");
                System.out.println("* SELAMAT DATANG *");
                System.out.println("==========================================");
                System.out.println("|| |Menu|                               ||");
                System.out.println("||  1. Pencarian Buku                   ||");
                System.out.println("||  2. Manajemen Katalog                ||");
                System.out.println("||  3. Peminjaman Buku                  ||");
                System.out.println("||  4. Pengembalian Buku                ||");
                System.out.println("||  5. Denda                            ||");
                System.out.println("||  6. Registrasi Anggota               ||");
                System.out.println("||  7. Keluar                           ||");
                System.out.println("==========================================");
                System.out.println();
                System.out.println("Pilih menu Anda dengan ketik angka menu yang ingin dipilih");
                System.out.print("Masukkan pilihan: ");
                int menu = input.nextInt();
                input.nextLine();

            switch(menu){
                case 1:
                System.out.println("\n|Pencarian Buku|");
                String keyJudul;
                System.out.print("Masukkan judul buku: ");
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
                break;

                case 2:
                System.out.println("\n|Manajemen Katalog Buku|");
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
                break;

                case 3:
                System.out.println("\n|Peminjaman Buku|");
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
                break;

            case 4:
                System.out.println("\n|Pengembalian Buku|");
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
                break;

                case 5:
                System.out.println("]n|Denda|");

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
                    System.out.println("Dikarenakan terlambat dalam mengembalikan buku yang dipinjam");
                    System.out.println("Atas nama " + peminjam + " akan dikenakan denda sebesar Rp 50.000");
                } else {
                    System.out.println("Dikarenakan tepat waktu dalam mengembalikan buku yang dipinjam");
                    System.out.println("Atas nama " + peminjam + " tidak dikenakan denda");
                }
                break;

                case 6:
                System.out.println("\n|Registrasi Anggota|");
                int indeks = indeksAnggota(anggota);
        
                if (indeks != -1) {
                anggota = dataAnggota(anggota, indeks);

                System.out.println("\nData Anggota: ");

                for (int i = 0; i < anggota.length; i++) {
                    System.out.print((i+1) + ". ");
                    for (int k = 0; k < anggota[i].length; k++) {
                        if (anggota[i][k] != null) {
                        System.out.print(anggota[i][k] + ", ");
                        } else {
                        break;
                        }
                    }
                System.out.println();
                }  

                } else {
                System.out.println("Member penuh");
                }
                break;

                case 7: 
                System.exit(0);
                break;

                default:
                System.out.println("# Angka yang dipilih tidak valid #");
                break;

                }
                
                System.out.print("\n  >>Pilih menu lain (y/t)? ");
                konfirmasi=input.next().charAt(0);
                System.out.println();

                } while (konfirmasi != 't');
           
            

            } else {
                System.out.println("# Login gagal. ID User atau Password salah #");

                System.out.print("  >>Apakah anda ingin mencoba lagi (y/t)? ");
                String konfirmasi = input.nextLine();

                if (!konfirmasi.equalsIgnoreCase("y")) {
                    break;
                }
            }
        } while (!berhasilLogin);

        input.close();
    }
}
