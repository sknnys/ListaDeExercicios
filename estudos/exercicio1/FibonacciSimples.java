package estudos.exercicio1;
public class FibonacciSimples {
    public static void main(String[] args) {
        int n = 7; // Quantos elementos gerar
        int[] lista = new int[n]; // Array para armazenar a sequência

        // Tratamento dos dois primeiros elementos
        if (n > 0) {
            lista[0] = 0;
        }
        if (n > 1) {
            lista[1] = 1;
        }
        // Loop para gerar os elementos restantes
        for (int i = 2; i < n; i++) {
            lista[i] = lista[i - 1] + lista[i - 2]; // Soma dos dois anteriores
        }

        // Imprime a sequência
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(lista[i]);
            if (i < n - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
