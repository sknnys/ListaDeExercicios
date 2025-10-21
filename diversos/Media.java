package diversos;


/*Soma e Média Peça um conjunto de números e mostre a soma total e a média. 
Avalia: loop e cálculo aritmético simples. */
public class Media {
    public static void main(String[] args) {
        
    int nums[] = {10,20,30,40,50};
    int somaTotal = 0;

    for(int i = 0; i < nums.length; i++){
        somaTotal = somaTotal + nums[i];
    }
    double media = somaTotal / nums.length;
    System.out.println("media: " +media);
    System.out.println("somaTotal: " + somaTotal);
    }
}
