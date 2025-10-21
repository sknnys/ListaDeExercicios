package estudos.primos.inversorDePalavras;

public class inverteTexto {
    public static String inverte(String texto) {
        String invertida = "";

        for(int i = texto.length() -1; i >= 0; i--){
        invertida += texto.charAt(i);

        }
        return invertida;
    }
    public static void main(String[] args) {
        String input = "PARALELEPIPEDO";
        System.out.println("invertida: " +inverte(input));
    }
}
