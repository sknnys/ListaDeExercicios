package diversos;
/* 5. Fibonacci Mostre os primeiros n números da sequência de Fibonacci. 
avalia: raciocínio recursivo e loop com soma dos dois anteriores. */
public class Fibonacci {

    public void gerarSequencia(int n){
        int primeiro = 0;
        int segundo = 1;

        for(int i = 2; i < n; i++){
            int prox = primeiro + segundo;
            System.out.println(prox);
            primeiro = segundo;
            segundo = prox;
        }
    }
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.gerarSequencia(12);
        }

}
