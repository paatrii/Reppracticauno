/*este programa visualiza el máximo 
 * común divisor de 2 números
 */
package programacionmodular;

import java.util.Scanner;

public class MCD2 {

	public static void main(String[] args)
	{
		
		int num1 = pedirNum1();
		int num2 = pedirNum2();
		int calcular = calcularMCD(num1, num2);
		verResultado (num1, num2, calcular);
	}
	
//////////////////////////////////////////////////////////////
	public static int pedirNum1() {
		//introducimos por teclado los números.
			Scanner entrada = new Scanner(System.in);
			System.out.println("introduzca el número1: ");
			return entrada.nextInt();
	}
	
///////////////////////////////////////////////////////////////
	public static int pedirNum2() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("introduzca el número2: ");
			return entrada.nextInt();
	}
	
//////////////////////////////////////////////////////
	public static int calcularMCD (int num1, int num2)
	{
		//comparamos número 1 con número 2.
				while(num1 != num2)
				{
				if(num1 > num2) {
					num1 = num1 - num2; 
				}else {
					num2 = num2 - num1;
				}
				}return num1;
	}
	
///////////////////////////////////////////////////////////////////////
	public static void verResultado (int num1, int num2, int calcular) {
		//Enviamos a pantalla el resultado
		System.out.println("el mcd de = "+ num1 + "y" + num2 + "=" + calcular);
				
	}
		
	
}



