package unidad01;

import java.util.Scanner;

public class boletin1act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer cateto");
		double cat1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo cateto");
		double cat2 = sc.nextDouble();
		
		double per = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		
		System.out.printf("La hipotenusa es %f \n", per);

	}

}