import java.util.Scanner;

/**
 * FibonacciMain
 */
public class FibonacciMain {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
       
        //interação com usuario
        System.out.print("DIGITE UM NUMERO: ");
        int numero = ler.nextInt();
        ler.close();

        //verificação
        if(numero <=0) {
            System.out.println("\nNumero deve ser positivo.");
        } else {
            boolean pertence = pertenceFibonacci(numero);
            if(pertence == true) {
                System.out.println("\npertence à sequência de Fibonacci.");
            }else {
                System.out.println("\nnão pertence à sequência de Fibonacci.");
            }
        }

}
        // Método para verificar se o numero pertence a sequencia fibonacci
        public static boolean pertenceFibonacci(int numero) {
            if (numero == 0) return true;
            if (numero == 1) return true;

            int primeiro = 0;
            int segundo = 1;
            int proximo;
            
            // Imprime a sequência inicial
            System.out.print(" "+primeiro+","+segundo);

              // Calcular a sequência até o número escolhido
            while(segundo <= numero) {
                proximo = primeiro + segundo;
                if(segundo == numero) {
                    return true;
                }
                primeiro = segundo;
                segundo = proximo;
                System.out.print(","+proximo);
            }
            return false;
    }
}