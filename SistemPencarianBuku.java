import java.util.Scanner;
public class SistemPencarianBuku {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         String genre, judul;
         System.out.print("Masukkan genre buku : ");
         genre = input.nextLine();
        System.out.print("Masukkan judul buku : ");
        judul = input.nextLine();
    

         if (genre.equalsIgnoreCase("fabel")) {
            if (judul.equalsIgnoreCase("sikancil"))
                System.out.println("buku tersedia");
            else if (judul.equalsIgnoreCase("buaya"))
                System.out.println("buku tersedia");
            else 
            System.out.println("buku tidak tersedia");
         } else if (genre.equalsIgnoreCase("legenda")) {
            if (judul.equalsIgnoreCase("malinKundang"))
                System.out.println("buku tersedia");
            else if (judul.equalsIgnoreCase("timunMas"))
                System.out.println("buku tersedia");
            else 
            System.out.println("buku tidak tersedia");
         } else
            System.out.println("genre buku tidak tersedia");



    }

}