import java.util.Scanner;
public class FiturRegistrasiAnggota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah anggota ");
        int jmlAnggota = input.nextInt();
        String[][] anggota = new String [jmlAnggota][4];

        for (int i = 0; i < jmlAnggota; i++) {
            System.out.println("Masukkan data anggota " + (i+1) + " : ");
            System.out.print("Nama: ");
            anggota[i][0] = input.next();
            System.out.print("Alamat: ");
            anggota[i][1] = input.next();
            System.out.print("Nim: ");
            anggota[i][2] = input.next();
            System.out.print("Nomer telepon: ");
            anggota[i][3] = input.next();
        }
        System.out.println("Data anggota: ");
        System.out.println("Anggota" + "\t" + "Name" + "\t" + "Alamat" + "\t" + " Nim" + "\t" + "Nomer telepon");
        for (int i = 0; i < jmlAnggota; i++) {
            System.out.println((i+1) + "\t" + anggota[i][0] + "\t" + anggota[i][1] + "\t" + anggota[i][2] + "\t" + anggota[i][3]);
        }

    }
}