package unidad01;

import java.util.Scanner;

public class boletin1act21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce calificacion 1");
		double cal1 = sc.nextDouble();
		
		System.out.println("Introduce calificacion 2");
		double cal2 = sc.nextDouble();
		
		System.out.println("Introduce calificacion 3");
		double cal3 = sc.nextDouble();
		
		double prom = (cal1 + cal2 + cal3) / 3;
		String mensaje = prom >= 5 ? "Aprobado" : "Suspenso";
		
		System.out.println(mensaje);

	}

}
