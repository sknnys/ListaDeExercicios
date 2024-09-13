import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {
        int count = 0;
        String palavra;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();
        
        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra (a) foi encontrada (" + count + ") vezes na palavra.");
        } else {
            System.out.println("A letra (a) não foi encontrada na palavra.");
        }

        scanner.close();
    }
}
