package unidad01;

import java.util.Scanner;

public class boletin1act15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de segundos que deseas convertir");
		int segt = sc.nextInt();
		
		int horas = segt / 3600;
		int segf = segt % 60;
		int mins = (segt / 60) % 60;
		
		System.out.printf("%d segundos son %d horas, %d minutos, %d segundos.\n", segt, horas, mins, segf);

	}

}
