package classes;

//Esta classe denominada "Jogadores" possui um atributo chamado "palpite"
//que � um n�mero gerado aleatoriamente pelo m�todo Math.random() e que
//ser� utilizado para tentar adivinhar o n�mero que a classe GuessLaunch gerar:
public class Jogadores {
	int palpite;
	public void guess() {
		palpite = (int) (Math.random() * 10);
	}
}
