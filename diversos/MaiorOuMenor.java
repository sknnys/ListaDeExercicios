package diversos;


 /*Receba uma lista (ou sequência) de números e mostre qual é o maior e o menor. 
 🧩 Avalia: controle de variáveis e comparação. */
public class MaiorOuMenor {
    public static void main(String[] args) {
        int number[] = {10,20,40,5};
        int maior = number[0];
        int atual = number[0];

        for(int i = 1; i < number.length; i++){
            if(maior < number[i]) {
                maior = number[i];
            }
            
        }
        System.out.println("o maior foi o: " +maior);
    }
}
