package classes;

//Esta classe denominada "Jogadores" possui um atributo chamado "palpite"
//que é um número gerado aleatoriamente pelo método Math.random() e que
//será utilizado para tentar adivinhar o número que a classe GuessLaunch gerar:
public class Jogadores {
	int palpite;
	public void guess() {
		palpite = (int) (Math.random() * 10);
	}
}
