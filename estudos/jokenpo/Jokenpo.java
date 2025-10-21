package estudos.jokenpo;

public class Jokenpo {
    public String jogarJokenpo(String jogada) {
        
        String[] escolha = {"pedra", "papel", "tesoura"};
        String computador = escolha[(int) (Math.random() * 3)];

        if(jogada.equals(computador)) {
            return "Empate! Ambas Escolheram " + jogada;
        } else if(jogada.equals("pedra") && computador.equals("tesoura")) {
            return "Voce Venceu! Pedra ganha de Tesoura";
        } else if (jogada.equals("tesoura") && computador.equals("papel")) {
            return "Voce Venceu! Tesoura ganha de Papel";
        } else if (jogada.equals("papel") && computador.equals("pedra")) {
            return "Voce Venceu! Papel ganha de Pedra";
        } else {
            return "Computador Venceu! " + computador + " ganha de " + jogada;
        }

    } 
    public static void main(String[] args) {
        Jokenpo jogo = new Jokenpo();
        String resultado = jogo.jogarJokenpo("papel");
        System.out.println(resultado);
    }
}