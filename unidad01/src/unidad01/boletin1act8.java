package unidad01;

import java.util.Scanner;

public class boletin1act8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo numero");
		int num2 = sc.nextInt();
		
		int difnum = Math.abs(num1 - num2);
		
		System.out.printf("La diferencia entre %d y %d es de %d \n", num1, num2, difnum);

	}

}
