package unidad01;

import java.util.Scanner;

public class boletin1act18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca las monedas de 2 euros");
		int doseur = sc.nextInt();
		System.out.println("Introduzca las monedas de 1 euro");
		int uneur = sc.nextInt();
		System.out.println("Introduzca las monedas de 50 centimos");
		int cincent = sc.nextInt();
		System.out.println("Introduzca las monedas de 20 centimos");
		int ventcent = sc.nextInt();
		System.out.println("Introduzca las monedas de 10 centimos");
		int diezcent = sc.nextInt();
		
		int total = (doseur * 200) + (uneur * 100) + (cincent * 50) + (ventcent * 20) + (diezcent * 10);
		int eurt = total / 100;
		int cent = total % 100;
		
		System.out.printf("En total tienes %d euros y %d céntimos \n", eurt, cent);	

	}

}
