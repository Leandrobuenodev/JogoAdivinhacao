import java.util.Scanner;  

public class JogoAdivinhacao {

    public static void main(String[] args) {
        
        // Scanner para capturar o que o usuário digitar no console.
        Scanner scanner = new Scanner(System.in);

        // Defino o número secreto que o jogador precisa adivinhar.
        int numeroSecreto = 9;

        // Variável para armazenar o chute do jogador, inicializo com valor inválido.
        int chute = -1;  

        // Aviso o jogador qual é a regra do jogo.
        System.out.println("Tente adivinhar o número entre 1 e 10:");

        // Enquanto o chute não for igual ao número secreto, mantenho o jogo ativo.
        while (chute != numeroSecreto) {  

            // Peço o chute do jogador.
            System.out.print("Seu chute: "); 

            // Leio o número digitado pelo jogador e guardo na variável chute.
            chute = scanner.nextInt();  

            // Verifico se o chute está correto.
            if (chute == numeroSecreto) {  

            // Se acertar, parabenizo o jogador.
                System.out.println("Parabéns! Você acertou."); 

                 } else {  

                // Se errar, peço para tentar novamente.
                System.out.println("Errado! Tente novamente.");  
            }
        }
        // Fecho o Scanner para liberar recursos.
        scanner.close();  
    }
}