package unidad01;

import java.util.Scanner;

public class boletin1act20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca tu edad:");
		int edad = sc.nextInt();
		
		String mensaje = edad < 18 || edad > 65 ? "Descuento aplicable": "Tarifa normal";
		System.out.println(mensaje);
		

	}

}
