package unidad01;

import java.util.Scanner;

public class boletin1act3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca los grados Fahrenheit:");
		double gradf = sc.nextDouble();
		
		double gradc = (gradf - 32) * 5.0 / 9.0;
		System.out.printf("%f grados fahrenheit son %f grados celsius \n", gradf, gradc);
		

	}

}
