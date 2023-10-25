import java.util.Scanner;
public class SistemPencarianBuku {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String keyJudul;
        System.out.print("Masukkan judul buku : ");
        keyJudul = input.nextLine();
        
        String[] judul = {"Si Kancil", "Malin Kundang","Timun Mas"};
        
        String[] penulis = {"Budi", "Andi", "Edo"};

        String[] tahun = {"2013", "2000", "2004"};

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
} 


