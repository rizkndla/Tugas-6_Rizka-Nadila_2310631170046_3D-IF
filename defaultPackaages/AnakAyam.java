package defaultPackaages;
import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int n = scanner.nextInt();
        
        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turunlah " + i);
            if (i > 1) {
                System.out.println("Mati satu tinggallah " + (i-1));
            } else {
                System.out.println("Mati satu tinggallah induknya");
            }
        }
        scanner.close();
    }
}