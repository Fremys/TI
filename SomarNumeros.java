import java.util.*;

class SomarNumeros {
	
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String args[])
	{
		//Declaracao de variaveis
		int num1, num2, soma;
		
		//Leituras
		
		System.out.println("Digite um n�mnero");
		num1 = sc.nextInt();
		System.out.println("digite outro n�mero");
		num2 = sc.nextInt();
				
		//Somar
		soma = num1 + num2;
		
		//mostrar na tela
		System.out.println("Soma:" + soma);
		
	}
}
