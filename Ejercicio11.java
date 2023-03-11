package ControlDeFlujo;
import java.util.Scanner; // Importamos el scanner

// Programa para evaluar examenes

public class Ejercicio11 {

	public static void main (String [] args) {
		
		// 1. Calificacion minima aprobatoria
		
		int calificacionAprobatoria = 60;
		
		// Creamos un objeto del tipo scanner, llamado entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa los puntos obtenidos");
		
		//Asignamos el valor ingresado por el scanner a una variable
		
		int calificacionIngresada = entrada.nextInt();
		
		// Condicion a evaluar con sus 2 posibles escenarios (Aprueba o no aprueba)
		if (calificacionIngresada >= calificacionAprobatoria ) {
            System.out.println("Felicitaciones, has aprobado el examen!");
        } else {
            System.out.println("Lo siento, has reprobado el examen.");
        }

		// Opcion con operador ternario
		
		String resultado = (calificacionIngresada >= calificacionAprobatoria) ? "Aprobado" : "No aprobado";
		System.out.println(resultado);
		
	}
}


// Nota para declarar constantes en Java
// Modificador tipoVariable nombreVariable = valor;