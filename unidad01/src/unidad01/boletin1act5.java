package unidad01;

import java.util.Scanner;

public class boletin1act5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el importe de la primera venta:");
		double imp1 = sc.nextDouble();
		
		System.out.println("Introduce el importe de la segunda venta:");
		double imp2 = sc.nextDouble();
		
		System.out.println("Introduce el importe de la tercera venta:");
		double imp3 = sc.nextDouble();
		
		double impt = (imp1 * 0.1) + (imp2 * 0.1) + (imp3 * 0.1);
		
		System.out.printf("Su sueldo de este mes es de %f + su sueldo base \n", impt);

	}

}
