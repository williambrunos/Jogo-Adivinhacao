package classes;
import java.util.Scanner;

//Esta classe roda todo o jogo de adivinha��o:
public class GuessLauncher {
	//Cria��o de objetos da classe Jogadores:
	Jogadores j1;
	Jogadores j2;
	Jogadores j3;

	//M�todo para inicializar o jogo:
	public void guessLaunch() {
		//Cria��o de um ojeto da classe Scanner para leitura de dados:
		Scanner input = new Scanner(System.in);
		
		//Cria��o dos objetos pelos m�todos construtores:
		j1 = new Jogadores();
		j2 = new Jogadores();
		j3 = new Jogadores();
		
		//O loop a seguir far� o jogo rodar at� que o n�mero gerado aleatoriamente seja
		//adivinhado por algum dos objetos Jogadores(ou mais de um). Ap�s isso, �
		//perguntado se o jogador deseja come�ar o jogo novamente e o valor � armazenado
		//na vari�vel a seguir:
		boolean continuar = true;
		do {
			System.out.println("Estou pensando em um n�mero entre 0 e 9. . .");
			//Gera o n�mero a ser adivinhado:
			int numero = (int) (Math.random() * 10);
			
			//Essa parte do c�digo chama os m�todos guess() para cada inst�ncia
			//da classe Jogadores e guarda um n�mero aleat�rio no atributo "palpite":
			j1.guess();
			j2.guess();
			j3.guess();
			
			//Os valores booleanos a seguir guardam true se o respectivo atributo "palpite"
			//da inst�ncia da classe Jogadores for igual ao n�mero gerado aleatoriamente
			//logo acima, no in�cio do loop. Se n�o, guarda false:
			boolean j1IsRight = (j1.palpite == numero)?true:false;
			boolean j2IsRight = (j2.palpite == numero)?true:false;
			boolean j3IsRight = (j3.palpite == numero)?true:false;
			
			System.out.println("Pensei no n�mero "+numero+". Agora deixe-me ver. . .");
			//Se qualquer uma das inst�ncias de Jogadores acertar o n�mero por meio do seu
			//atributo "palpite", o loop � quebrado por meio do "break" e o programa informa
			//quem acertou:
			if(j1IsRight || j2IsRight || j3IsRight) {
				System.out.println("Oh, Temos um vencedor!");
				System.out.println("Jogador 1 acertou: "+j1IsRight+", seu palpite foi "+j1.palpite);
				System.out.println("Jogador 2 acertou: "+j2IsRight+", seu palpite foi "+j2.palpite);
				System.out.println("Jogador 3 acertou: "+j3IsRight+", seu palpite foi "+j3.palpite);
				System.out.println("Game-Over, continue? [true][false]: ");
				continuar = input.nextBoolean();
			}else {
				//Se ningu�m acertar, o programa volta ao in�cio do loop e o jogo � iniciado novamente at�
				//que alguma inst�ncia acerte o n�mero gerado:
				System.out.println("Ningu�m acertou, continuaremos ent�o. . .");
			}
			
			
		}while(continuar == true);
		
		System.out.println("Saindo do jogo. . .");
		input.close();
	}
}
