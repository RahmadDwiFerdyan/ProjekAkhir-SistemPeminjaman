import java.util.Scanner;

public class SistemPeminjamanBuku01 {
    public static int indeksLokerPinjam(String[][] anggota, String nimPinjam, int[][] dataPeminjaman) {
        int indexAnggota = indeksAnggotaPinjam(anggota, nimPinjam);
        if (indexAnggota != -1) {
            for (int i = indexAnggota * 3; i < indexAnggota * 3 + 3; i++) {
                if (dataPeminjaman[i][0] == 0) {
                    return i;
                }
            }
        } 
        return -1;
    }
    public static int indeksAnggotaPinjam(String[][] anggota, String nimPinjam) {
        for (int i = 0; i < anggota.length; i++) {
            if (nimPinjam.equals(anggota[i][1])) {
                return i;
            }
        }
        return -1;
    }

    // ======================================================================================================

    public static int indeksLokerKembali(String[][] anggota, String nimPinjam, int noBukuPinjam, int[][] dataPeminjaman) {
        int indexAnggota = indeksAnggotaKembali(anggota, nimPinjam);
        int indexBuku;
        if (indexAnggota != -1) {
            indexBuku = indeksBukuKembali(indexAnggota, noBukuPinjam, dataPeminjaman);
            return indexBuku;
            }
        
        return -1;
    }
    public static int indeksAnggotaKembali (String[][]anggota, String nimKembali){
        int i;
        for (i = 0; i<anggota.length; i++){
                    if (nimKembali.equals(anggota[i][1])){
                        return i;
                    }
                }
                return -1;
    }
    public static int indeksBukuKembali (int indexAnggota, int noBukuPinjam, int[][] dataPeminjaman){
        for (int i = indexAnggota*3; i<indexAnggota*3+3; i++){
                    if (noBukuPinjam==(dataPeminjaman[i][6])){
                        return i;
                    }
                }
                return -1;
    }

    // ======================================================================================================

    public static int indeksDenda (long[][] dataDenda){
        for (int j = 0; j < dataDenda.length; j++) {
            if (dataDenda[j][0] == 0) {
                return j;
            }
        }
        return -1; 
    }
    public static long[][] PencatatanDenda(long[][] dataDenda, int j, int[][] dataPeminjaman, String nimKembali, int durasi, int k) {
        long nimConvert = Long.valueOf(nimKembali);
        dataDenda[j][8]=durasi;
        dataDenda[j][7]=nimConvert;
        for (int i=0; i < 7; i++) {
            dataDenda[j][i] = dataPeminjaman[k][i];
        }
        return dataDenda;
    } 

    /*======================================================================================================= */


    public static boolean fiturLogin(String userID, String password, String[] arrayID, String[] arrayPW) {
        for (int i = 0; i < arrayID.length; i++) {
            if (userID.equals(arrayID[i]) && password.equals(arrayPW[i])) {
                return true;
            }
        }
        return false;
    }

    /*======================================================================================================= */

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
        System.out.println("\nMasukkan data anggota: ");
        System.out.print("Nama          : ");
        anggota[j][0] = input.nextLine();
        System.out.print("NIM           : ");
        anggota[j][1] = input.nextLine();
        System.out.print("Alamat        : ");
        anggota[j][2] = input.nextLine();
        System.out.print("No. Telepon   : ");
        anggota[j][3] = input.nextLine();

        return anggota;
    }

    /*======================================================================================================= */

    public static int indeksBuku(String[][] buku) {
        for (int j = 0; j < buku.length; j++) {
            if (buku[j][0] == null) {
                return j;
            }
        }
        return -1; 
    }

    public static String[][] dataBuku(String[][] buku, int j) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n>>Masukkan data buku");
        System.out.print("Judul            : ");
        buku[j][0] = input.nextLine();
        System.out.print("Penulis          : ");
        buku[j][1] = input.nextLine();
        System.out.print("Penerbit         : ");
        buku[j][2] = input.nextLine();
        System.out.print("Tahun Terbit     : ");
        buku[j][3] = input.nextLine();
        System.out.print("No. Buku         : ");
        buku[j][4] = input.nextLine();

        return buku;
    }

    /*======================================================================================================= */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayID = {"hamzah02", "Febri11", "Ferdyan20", "a"};
        String[] arrayPW = {"polinema02", "polinema11", "polinema20", "b"};
        int [] bulan = {31,28,31,30,31,30,31,31,30,31,30,31};
        int [][] dataPeminjaman = new int [15][7];
        long[][] dataDenda = new long [15][9];

        String[][] anggota = new String [5][4];

            anggota[0][0] = "Achmad Maulana Hamzah";
            anggota[0][1] = "2341720172";
            anggota[0][2] = "Malang";
            anggota[0][3] = "08123456789";

            anggota[1][0] = "Febriansyah Adi Nugroho";
            anggota[1][1] = "2341720023";
            anggota[1][2] = "Malang";
            anggota[1][3] = "08123456789";
    
        String[][] buku = new String[5][5];
            buku[0][0] = "Si Kancil";
            buku[0][1] = "Budi Hariadi";
            buku[0][2] = "Gramedia";
            buku[0][3] = "2013";
            buku[0][4] = "101";

            buku[1][0] = "Malin Kundang";
            buku[1][1] = "Andi Sucipto";
            buku[1][2] = "Gramedia";
            buku[1][3] = "2000";
            buku[1][4] = "102";

            buku[2][0] = "Timun Mas";
            buku[2][1] = "Burhanuddin";
            buku[2][2] = "Dua Media";
            buku[2][3] = "2005";
            buku[2][4] = "103";

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
                System.out.println("\n          ** SELAMAT DATANG **          \n");
            char konfirmasi;
            do{
                System.out.println("============================================");
                System.out.println("----------------- M E N U ------------------");
                System.out.println("============================================");
                System.out.println("||    1. Pencarian Buku                   ||");
                System.out.println("||    2. Manajemen Katalog Buku           ||");
                System.out.println("||    3. Peminjaman Buku                  ||");
                System.out.println("||    4. Pengembalian Buku                ||");
                System.out.println("||    5. Denda                            ||");
                System.out.println("||    6. Registrasi Anggota               ||");
                System.out.println("||    7. Keluar                           ||");
                System.out.println("============================================");
                System.out.println();
                System.out.println("Pilih menu dengan ketik angka dari menu yang \n ingin dipilih!");
                System.out.print("  >>Masukkan pilihan: ");
                int menu = input.nextInt();
                input.nextLine();

            switch(menu){
                case 1: //Pencarian Buku
                System.out.println("\n============================================");
                System.out.println("               Pencarian Buku               ");
                System.out.println("============================================");
                String keyJudul;

                System.out.print("Masukkan judul buku: ");
                keyJudul = input.nextLine();
                boolean tersedia = false;

                for (int i=0; i<buku.length; i++ ){
                    if (keyJudul.equalsIgnoreCase(buku[i][0])){
                        System.out.println("\n[Buku tersedia]");
                        System.out.println("> Judul           : "+buku[i][0]);
                        System.out.println("  Penulis         : "+buku[i][1]);
                        System.out.println("  Penerbit        : "+buku[i][2]);
                        System.out.println("  Tahun terbit    : "+buku[i][3]);
                        System.out.println("  No. Buku        : "+buku[i][4]);
                        tersedia = true;
                    } 
                } if (!tersedia){
                    System.out.println("[Buku tidak tersedia]");
                }
                break;

                case 2://Manajemen Buku
                System.out.println("\n============================================");
                System.out.println("            Manajemen Katalog Buku          ");
                System.out.println("============================================");

                int indeks = indeksBuku(buku);
                
                if (indeks != -1) {
                    buku = dataBuku(buku, indeks);
                
                System.out.println("\nDaftar Buku: ");

                System.out.println("[Judul]\t\t[Penulis]\t[Penerbit}\t[Tahun Terbit]\t[Nomor Buku]");
                System.out.println("============================================================================");

                    for (int i = 0; i < buku.length; i++) {
                        for (int k = 0; k < buku[i].length; k++) {
                            if (buku[i][k] != null && k==3) {
                                System.out.print(buku[i][k] + "\t\t");
                            } else if (buku[i][k] != null) {
                                System.out.print(buku[i][k] + "\t");
                            } else {
                                break;
                            }
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Slot penuh");
                }

                break;

                case 3://Peminjaman Buku
                System.out.println("\n============================================");
                System.out.println("                Peminjaman Buku             ");
                System.out.println("============================================");

                boolean bukuTersedia = false;
                System.out.print("Masukkan NIM Peminjam           : ");
                String nimPinjam = input.nextLine();
                
                for (int i=indeksLokerPinjam(anggota, nimPinjam, dataPeminjaman); i==indeksLokerPinjam(anggota, nimPinjam, dataPeminjaman);){
                    if(i==-1){
                            System.out.println("\n## NIM Tidak Terdaftar! ##");
                            break;    
                    } else if (dataPeminjaman[i][0]==0){
                            System.out.print("Masukkan No. Buku yang dipinjam : ");
                            dataPeminjaman[i][6] = input.nextInt();
                            String noBukuConvert = String.valueOf(dataPeminjaman[i][6]);
                            for (int j=0; j<buku.length; j++){
                                if (noBukuConvert.equals(buku[j][4])){
                                    bukuTersedia = true;
                                    System.out.println("\n=== DATA PEMINJAMAN ===");
                                    System.out.print("Tanggal       : ");
                                    dataPeminjaman[i][0]= input.nextInt();
                                    System.out.print("Bulan (1-12)  : ");
                                    dataPeminjaman[i][1]= input.nextInt();
                                    System.out.print("Tahun         : ");
                                    dataPeminjaman[i][2] = input.nextInt();
                                }
                            }
                            if (!bukuTersedia){
                                System.out.println("  ## Buku tidak tersedia ##");
                            }
                        }
                }
                break;

            case 4:
                System.out.println("\n============================================");
                System.out.println("                Pengembalian Buku           ");
                System.out.println("============================================");

                System.out.print("Masukkan NIM Peminjam               : ");
                String nimKembali = input.nextLine();
                int a = indeksAnggotaKembali(anggota, nimKembali);
                System.out.println("        ______________________________________");
                System.out.println("            DAFTAR PEMINJAMAN                   ");
                System.out.println("            Nama    :" + anggota[a][0]);
                System.out.println("            NIM     :" + anggota[a][1]);
                System.out.println("");
                System.out.println("            |No. Buku|\t|Tgl Pinjam|");
                for (int b=a*3; b<a*3+3; b++){
                    if(dataPeminjaman[b][6]==0){
                        System.out.println("            (-)\t\t(-)");
                    } else {
                        System.out.println("            "+ dataPeminjaman[b][6] + "\t\t" + dataPeminjaman[b][0]+"-"+dataPeminjaman[b][1]+"-"+dataPeminjaman[b][2]);
                    } 
                }
                System.out.println("        ______________________________________");

                System.out.print("\nMasukkan No. Buku yang dikembalikan : ");
                int noBukuKembali = input.nextInt(); 

                for (int i=(indeksLokerKembali(anggota, nimKembali, noBukuKembali, dataPeminjaman)); i==(indeksLokerKembali(anggota, nimKembali, noBukuKembali, dataPeminjaman)); i++){
                    if(i==-1){
                            System.out.println("\n# NIM Tidak Terdaftar! #");
                            break;     
                    } else if (dataPeminjaman[i][3]==0){
                            System.out.println("\n=== DATA PENGEMBALIAN ===");
                            System.out.print("Tanggal       : ");
                            dataPeminjaman[i][3]= input.nextInt();
                            System.out.print("Bulan (1-12)  : ");
                            dataPeminjaman[i][4]= input.nextInt();
                            System.out.print("Tahun         : ");
                            dataPeminjaman[i][5] = input.nextInt();

                            int durasi;
                            if (dataPeminjaman[i][1]==dataPeminjaman[i][4]){
                                durasi = dataPeminjaman [i][3] - dataPeminjaman[i][0]; 
                            } else {
                                durasi = (dataPeminjaman [i][3] + bulan [dataPeminjaman[i][1]-1]) - dataPeminjaman[i][0];
                            }
                            

                            if (durasi>5){
                                System.out.println("\nDurasi peminjaman anda: " + durasi + " hari\n ***melebihi batas maksimal durasi peminjaman");
                            int indeksDenda = indeksDenda(dataDenda);
                                if (indeksDenda != -1) {
                                dataDenda = PencatatanDenda(dataDenda, indeksDenda, dataPeminjaman, nimKembali, durasi, i);
                                }
                            } else {
                                System.out.println("\nDurasi peminjaman anda: " + durasi + " hari");
                                
                            }
                            for (int j = 0; j < 7; j++) {
                                dataPeminjaman[i][j] = 0;
                            }   
                }
            }

                break;

                case 5:
                System.out.println("\n============================================");
                System.out.println("                Pencatatan Denda            ");
                System.out.println("============================================");

                System.out.print("Masukkan NIM  : ");
                long nimDenda = input.nextLong();

                for (int i=0; i<dataDenda.length; i++){
                    if (dataDenda[i][7]==nimDenda){
                        System.out.println("No.Buku\tTgl Pinjam\tTgl Kembali");
                        System.out.println("> " + dataDenda[i][6] +"    "+ dataDenda[i][0]+"/" + dataDenda[i][1]+"/" + dataDenda[i][2]+"\t" + dataDenda[i][3]+"/"+ dataDenda[i][4]+"/"+ dataDenda[i][5]);
                        System.out.println("    Durasi peminjaman: " +dataDenda[i][8] + " hari | Keterlambatan: " + (dataDenda[i][8]-5) + " hari");
                        long bayarDenda = (dataDenda[i][8]-5)*2000 ;
                        System.out.println("    Bayar denda sejumlah: " + bayarDenda + " rupiah");
                    }
                }

                break;

                case 6:
                System.out.println("\n============================================");
                System.out.println("               Registrasi Anggota           ");
                System.out.println("============================================");
                int indeksAng = indeksAnggota(anggota);
        
                if (indeksAng != -1) {
                anggota = dataAnggota(anggota, indeksAng);

                System.out.println("\nDaftar Anggota: ");

                for (int i = 0; i < anggota.length; i++) {
                    if (anggota[i] != null){
                        System.out.print((i+1) + ". ");
                    } 
                    for (int k = 0; k < anggota[i].length; k++) {
                        if (anggota[i][k] != null) {
                        System.out.print(anggota[i][k] + " | ");
                        } else {
                        continue;
                        }
                    }
                System.out.println();
                }  

                } else {
                System.out.println("\n## Member penuh ##\n");
                for (int i = 0; i < anggota.length; i++) {
                    if (anggota[i] != null){
                        System.out.print((i+1) + ". ");
                    } 
                    for (int k = 0; k < anggota[i].length; k++) {
                        if (anggota[i][k] != null) {
                        System.out.print(anggota[i][k] + " | ");
                        } else {
                        continue;
                        }
                    }
                System.out.println();
                }
                }
                break;

                case 7: 
                System.exit(0);
                break;

                default:
                System.out.println("## Angka yang dipilih tidak valid ##");
                break;

                }
                
                System.out.print("\n  >>Pilih menu lain (y/t)? ");
                konfirmasi=input.next().charAt(0);
                System.out.println();

                } while (konfirmasi != 't');    
            

            } else {
                System.out.println("## Login gagal. ID User atau Password salah ##");

                System.out.print("  >>Coba login lagi (y/t)? ");
                String konfirmasi = input.nextLine();

                if (!konfirmasi.equalsIgnoreCase("y")) {
                    break;
                }
            }
        } while (!berhasilLogin);

        input.close();
    }

}
