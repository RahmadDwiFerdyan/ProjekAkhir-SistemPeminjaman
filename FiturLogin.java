import java.util.Scanner;
public class FiturLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int username, password;
        System.out.print("Masukkan username anda = ");
        username = input.nextInt();
        System.out.print("Masukkan password anda = ");
        password = input.nextInt();

        if (username == 123 && password == 123) {
            System.out.println("Login anda berhasil");
        } 
        else {
            System.out.println("Login anda gagal");
        }
    }
}
