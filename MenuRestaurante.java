package ControlDeFlujo;

import java.util.Scanner;
//Programa para crear un menu de restaurante

public class MenuRestaurante {
	
	

	public static void main(String[] args) {
		// Scanner para pedir al usuario una opcion
		System.out.println("or favor ingresa una opcion del 1 al 4");
		Scanner opcion = new Scanner (System.in);
		
		// Guardamos el dato que ingresamos en el Scanner
		
		int opcionIngresada = opcion.nextInt();
		
		switch(opcionIngresada) {
		
		case 1:
			System.out.println("Hacer un pedido");
			break;
		case 2:
			System.out.println("Pagar un pedido");
			break;
		case 3:
			System.out.println("Cancelar un pedido");
			break;
		case 4:
			System.out.println("Revisar estatus del pedido");
			break;
		default:
			System.out.println("Ingresaste una opcion invalida");
		}
		
	}

}