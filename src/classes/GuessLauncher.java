package classes;
import java.util.Scanner;

//Esta classe roda todo o jogo de adivinhação:
public class GuessLauncher {
	//Criação de objetos da classe Jogadores:
	Jogadores j1;
	Jogadores j2;
	Jogadores j3;

	//Método para inicializar o jogo:
	public void guessLaunch() {
		//Criação de um ojeto da classe Scanner para leitura de dados:
		Scanner input = new Scanner(System.in);
		
		//Criação dos objetos pelos métodos construtores:
		j1 = new Jogadores();
		j2 = new Jogadores();
		j3 = new Jogadores();
		
		//O loop a seguir fará o jogo rodar até que o número gerado aleatoriamente seja
		//adivinhado por algum dos objetos Jogadores(ou mais de um). Após isso, é
		//perguntado se o jogador deseja começar o jogo novamente e o valor é armazenado
		//na variável a seguir:
		boolean continuar = true;
		do {
			System.out.println("Estou pensando em um número entre 0 e 9. . .");
			//Gera o número a ser adivinhado:
			int numero = (int) (Math.random() * 10);
			
			//Essa parte do código chama os métodos guess() para cada instância
			//da classe Jogadores e guarda um número aleatório no atributo "palpite":
			j1.guess();
			j2.guess();
			j3.guess();
			
			//Os valores booleanos a seguir guardam true se o respectivo atributo "palpite"
			//da instância da classe Jogadores for igual ao número gerado aleatoriamente
			//logo acima, no início do loop. Se não, guarda false:
			boolean j1IsRight = (j1.palpite == numero)?true:false;
			boolean j2IsRight = (j2.palpite == numero)?true:false;
			boolean j3IsRight = (j3.palpite == numero)?true:false;
			
			System.out.println("Pensei no número "+numero+". Agora deixe-me ver. . .");
			//Se qualquer uma das instâncias de Jogadores acertar o número por meio do seu
			//atributo "palpite", o loop é quebrado por meio do "break" e o programa informa
			//quem acertou:
			if(j1IsRight || j2IsRight || j3IsRight) {
				System.out.println("Oh, Temos um vencedor!");
				System.out.println("Jogador 1 acertou: "+j1IsRight+", seu palpite foi "+j1.palpite);
				System.out.println("Jogador 2 acertou: "+j2IsRight+", seu palpite foi "+j2.palpite);
				System.out.println("Jogador 3 acertou: "+j3IsRight+", seu palpite foi "+j3.palpite);
				System.out.println("Game-Over, continue? [true][false]: ");
				continuar = input.nextBoolean();
			}else {
				//Se ninguém acertar, o programa volta ao início do loop e o jogo é iniciado novamente até
				//que alguma instância acerte o número gerado:
				System.out.println("Ninguém acertou, continuaremos então. . .");
			}
			
			
		}while(continuar == true);
		
		System.out.println("Saindo do jogo. . .");
		input.close();
	}
}
