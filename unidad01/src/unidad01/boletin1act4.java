package unidad01;

import java.util.Scanner;

public class boletin1act4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero de preguntas correctas");
		int correcta = sc.nextInt();
		System.out.println("Introduzca el numero de preguntas incorrectas");
		int incorrecta = sc.nextInt();
		System.out.println("Introduzca el numero de preguntas en blanco");
		int blanco = sc.nextInt();
		
		int notmax = (correcta + incorrecta + blanco) * 5;
		int resultado = (correcta * 5) + (incorrecta * -1);
		
		System.out.printf("Su nota es %d / %d \n", resultado, notmax);
		
	}

}
