package estudos.paresEimpares;
public class ParOuImpar {
    public static void main(String[] args) {
        // Lista de números para testar
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};

        // Chama a função que analisa pares e ímpares
        int[] resumo = analisarParImpar(numeros);

        // Mostra o resumo final
        System.out.println("Resumo -> Pares: " + resumo[0] + ", Ímpares: " + resumo[1]);
    }

    // Função que percorre a lista e conta pares e ímpares
    public static int[] analisarParImpar(int[] lista) {
        int pares = 0;   // Contador de pares
        int impares = 0; // Contador de ímpares

        // Percorre cada número da lista
        for (int numero : lista) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é Par");
                pares++; // Incrementa pares
            } else {
                System.out.println(numero + " é Ímpar");
                impares++; // Incrementa ímpares
            }
        }

        // Retorna resumo em um array [pares, impares]
        return new int[]{pares, impares};
    }
}
