package estudos.AnaliseNotasHash;

import java.util.HashMap;
import java.util.Map;

public class AnaliseNotasHash {
        public static Map<String, Double> analisarNotas(double[] notas) {
        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];

        // Loop para percorrer todas as notas
        for (double nota : notas) {
            soma += nota;

            if (nota > maior)
                maior = nota;
            if (nota < menor)
                menor = nota;
        }

        double media = soma / notas.length;

        // Criar o Map para guardar resultados
        Map<String, Double> resultado = new HashMap<>();
        
        resultado.put("media", media);
        resultado.put("maior_nota", maior);
        resultado.put("menor_nota", menor);

        return resultado;
    }
    public static void main(String[] args) {
            double[] notas = { 8.5, 9.0, 7.2, 6.0, 10.0, 8.8 };

            Map<String, Double> analise = analisarNotas(notas);

            System.out.println("Média: " + analise.get("media"));
            System.out.println("Maior nota: " + analise.get("maior_nota"));
            System.out.println("Menor nota: " + analise.get("menor_nota"));
        }
}