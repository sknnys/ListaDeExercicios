package estudos.AnaliseNotas;
public class AnaliseNotas {
    public static void main(String[] args) {
        double[] notas = {8.5, 9.0, 7.2, 6.0, 10.0, 8.8};

        double soma = 0, 
        maior = notas[0], 
        menor = notas[0];

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (notas[i] > maior) 
            maior = notas[i];

            if (notas[i] < menor) 
            menor = notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}