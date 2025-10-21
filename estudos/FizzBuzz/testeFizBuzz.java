package estudos.FizzBuzz;

public class testeFizBuzz {
    public static void main(String[] args) {
        int n = 100;

        //for pra percorrer

         for(int i = 1; i <= n; i++) {
            String saida = ""; //saida sempre como 0 pra sobrescrever a cada interação

            if(i % 3 == 0) {
                saida += "fizz";
            }
             if(i % 5 == 0) {
                saida += "Buzz";
             }
             if(i % 7 ==0 ) {
                saida += "NOVO";
             }
             if(saida.equals("")) saida = String.valueOf(i);
              System.out.println(saida); 
            }
        }
    }