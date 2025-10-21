package estudos.contagemCaracteres;

import java.util.HashMap;

public class Contagem {
    public static HashMap<Character, Integer> contar(String texto){
        HashMap<Character, Integer> contados = new HashMap<>();
        
        for(char c : texto.toCharArray()){
            contados.put(c, contados.getOrDefault(contados, 0) + 1);
        }
        
        return contados;

    }

    public static void main(String[] args) {
        String entrada = "ABACABXAI";
        System.out.println(contar(entrada));
    }
}
