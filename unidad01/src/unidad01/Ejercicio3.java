package unidad01;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el seguno numero");
		int num2 = sc.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int mult = num1 * num2;
		double div  = (num1 * 1.0) / num2;
		
		System.out.printf("Suma = %d \n", suma);
		System.out.printf("Resta = %d \n", resta);
		System.out.printf("Multiplicacióm = %d \n", mult);
		System.out.printf("División = %.3f \n", div);
		
		
		
	}

}
