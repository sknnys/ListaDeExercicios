package estudos.Fatorial;

public class Fat {
    public static void main(String[] args) {
        int n = 5;
        int fat = 1;

        for(int i = 1; i <=n; i++){
            fat *= i;
        }
        System.out.println("fat: " + fat);
    }
}
