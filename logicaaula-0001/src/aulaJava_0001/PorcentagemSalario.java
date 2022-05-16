package aulaJava_0001;

//Crie uma calculadora para calcular o imposto devido de um colaborador.

public class PorcentagemSalario {
	public static void main(String[] args) {
		float salario = 2500.00F;
		float porcentagem = 0.3F;
		float porcentagemImposto = salario * porcentagem;
		
		System.out.println("O imposto devido é de: " + porcentagemImposto);
	}
}
