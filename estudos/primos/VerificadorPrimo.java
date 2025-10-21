package estudos.primos;

public class VerificadorPrimo {
    public static boolean ehPrimo(int n) {
        if (n <= 1) { // ele n é primo ou é negativo nao primo
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(ehPrimo(7));  // true
        System.out.println(ehPrimo(3)); // false
    }
}
