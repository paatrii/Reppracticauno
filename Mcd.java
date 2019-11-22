package programacionmodular;

import java.util.Scanner;

public class Mcd {

	public static void main(String[] args) {
		System.out.println("Introduce número 1");
		int numero1 = pedirNumero();
		System.out.println("Introduce número 2");
		int numero2 = pedirNumero();
		int mcd = calcularMcd(numero1, numero2);
		verResultado(numero1, numero2, mcd);
	}
///////////////////////////////////////////////
	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		return numero;
	}
	
///////////////////////////////////////////////
	public static int calcularMcd(int numero1, int numero2) {
		while(numero1 != numero2) {
			if (numero1 > numero2) {
				numero1 = numero1- numero2;
			}else {
				numero2 = numero2-numero1;
			}
		}
		return numero1;
	}
	/////////////////////////////////////////////
	public static void verResultado(int numero1, int numero2, int mcd) {
		System.out.println("El mCd de " + numero1 + " y " + numero2 + " es " + mcd);
	}
}
