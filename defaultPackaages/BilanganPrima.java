package defaultPackaages;

public class BilanganPrima {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " bilangan prima ");
            } else {
                System.out.println(i + " bukan bilangan prima ");
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
