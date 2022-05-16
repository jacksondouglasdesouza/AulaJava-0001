package aulaJava_0001;

// Variáveis Char | String | Boolean

public class TexteDeVariaveis {
	public static void main(String[] args) {
		char caractere_n1 = 66; // Tabela ASCII
		char caractere_n2 = 128; // Tabela ASCII
		char caractere_n3 = 125; // Tabela ASCII

		System.out.println(caractere_n1 + "\n" + caractere_n2 + "\n" + caractere_n3 + "\n");

		char generoMasculino = 'M'; // Proposito do Char guarda 1 bit
		char generoFeminino = 'F';

		System.out.println(generoFeminino + "\n" + generoMasculino);

		String nomeCompleto = "Jackson Douglas de Souza";

		System.out.println("O nome é: " + nomeCompleto);

		boolean verdadeiro = true;
		boolean falso = false;
		boolean duvida = true && false;

		System.out.println("A duvida é verdadeira? [ " + duvida + " ]");

	}

}