package estudos.maior;

public class Maior {
    public static int maiores(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int numeros[] = { 10, 25, 5, 60, 45 };
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            maior = maiores(maior, numeros[i]);
        }
        System.out.println("O maior numero é: " + maior);
    }
}