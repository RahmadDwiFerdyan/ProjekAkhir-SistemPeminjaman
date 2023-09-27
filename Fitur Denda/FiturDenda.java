import java.util.Scanner;
public class FiturDenda {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
    int durasi;

    System.out.println("\nMasukkan durasi peminjaman (hari): ");
    durasi=input.nextInt();

    if (durasi>5){
        System.out.println("Dikenakan denda");
    }
    else {
        System.out.println("Tidak dikenakan denda");
    }
 }
}