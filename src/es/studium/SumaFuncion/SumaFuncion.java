package es.studium.SumaFuncion;

import java.util.Scanner;

public class SumaFuncion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, r;
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		numero2 = teclado.nextInt();
		teclado.close();
		r = suma(numero1, numero2);
		System.out.println("La suma de los dos numeros es " + r);
	}

	public static int suma(int a, int b)

	{
		return (a + b);

	}

}
