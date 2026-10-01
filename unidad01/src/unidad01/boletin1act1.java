package unidad01;

import java.util.Scanner;

public class boletin1act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca la base del rectángulo");
		int base = sc.nextInt();
		
		System.out.println("Introduzca la altura de rectángulo");
		int alt = sc.nextInt();
		
		int area = base * alt;
		int perimetro = (base + alt) * 2;
		
		System.out.printf("el area es %d y el perimetro es %d \n", area, perimetro);
	}

}
