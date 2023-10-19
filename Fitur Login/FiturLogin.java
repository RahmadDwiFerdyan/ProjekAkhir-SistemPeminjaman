import java.util.Scanner;
public class FiturLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, konfirmasi;
    System.out.println("          LOGIN           ");
    System.out.print("Masukkan username  : ");
    username = input.nextLine();
    System.out.print("Masukkan password  : ");
    password = input.nextLine();

 if (username.equals("polinema") && password.equals("jti")) {
    System.out.println("\n>>> Login berhasil <<<\n");
 } else { 
    
    do {
        System.out.println("\n### Login gagal ###");
        System.out.print("Apakah anda ingin mencoba lagi (y/t)? ");
        konfirmasi = input.nextLine();
            if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("\nMasukkan username  : ");
            username = input.nextLine();
            System.out.print("Masukkan password  : ");
            password = input.nextLine();
                if (username.equalsIgnoreCase("polinema") && password.equalsIgnoreCase("jti")) {
                System.out.println("\n>>> Login berhasil <<<\n");
                break;
                } else {
                continue;
                }
            } else {
                break;
            } 

    } while (konfirmasi != "t"); 
}
    }
}
