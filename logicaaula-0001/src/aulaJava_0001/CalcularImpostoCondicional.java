package aulaJava_0001;

public class CalcularImpostoCondicional {

	public static void main(String[] args) {

		float salarioUsuario = 4500F;
		float impostoDevido;

		if (salarioUsuario >= 4500) {
			impostoDevido = salarioUsuario * 0.3F;
			System.out.println("O imposto devido é: [ " + impostoDevido + " ]");
		} else {
			impostoDevido = salarioUsuario * 0.15F;
			System.out.println("O imposto devido é: [ " + impostoDevido + " ]");
		}
	}

}
