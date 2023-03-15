package Ciclos;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejemplo de ciclo while
		
		// Programa para leer numeros. Cuando detecte un numero negativo, se detiene y muestra la suma total
		
		
	// Escaner para pedir numeros
		System.out.println("Ingresa un numero positivo");
		Scanner numerosEntrada = new Scanner(System.in);
		
	// Guardamos el valor del escaner en una variable
		
		int datoGuardado = numerosEntrada.nextInt();
		
		int suma = 0;
		
				
		while (datoGuardado >= 0) {
			//instruccion que se ejecuta cuando la condicion es true
			suma = suma + datoGuardado;
			System.out.println("Ingresa otro numero (numero negativo finaliza el ciclo)");
			datoGuardado = numerosEntrada.nextInt(); // Segunda Lectura
		}// fin while
		
		System.out.println("La suma es: "+ suma);
		
		//Ejemplo con do-while (Hacer mientras)
		//Programa que pide un numero menor o igual a 100 (Si lee numero mayor o igual a 100, se detiene)
		
				
		int valor; //declaro una variable llamada valor
		
		Scanner input = new Scanner(System.in); //dato ingresado
		
		do {  //inicio del do .. while
            System.out.print("Introduce un número entero <= 100: ");                                              
            valor = input.nextInt();
            if(valor > 100){
                System.out.println("Número no válido");
            }
        }while (valor > 100);  //fin del do .. while
        System.out.println("Ha introducido: " + valor);

        
    // Ejemplo de FOR para imprimir los numeros del 1 al 10
        
        /* For (inicializacion; condicion; actualizacion){
         * ....
         * }
         */
  
        for (int numeroActual = 1; numeroActual <= 10; numeroActual++) {
        	System.out.println("Ha introcuciodo: " + valor);
        }
        
        
        // Otro ejemplo de FOR para imprimir hola 5 veces
        for (int valorFor = 1;valorFor <5; valorFor++) {
        	System.out.println("Hola");
        }
        
        // Hack para determinar de forma rapida donde inicia y donde termina
        for (int valorFor2 = 1;valorFor2 <5; valorFor2++) {
        	System.out.println("Hola Caracola" + valorFor2);
        }
        
        // Arreglo de elementos
        
        int[] numeritos = {1, 2, 3, 4, 5};
        
        
        for (int elemento = 0; elemento<numeritos.length; elemento++) {
        	System.out.println(numeritos[elemento]);
        }
        
        // Impresion de una lista de supermercado
        
        String [] listaSuper = {"Botanas", "Maruchan", "Panales", "Kinder Buenos", "Verduras", "Mayonesa", "Galletas", "Webito"};
         
                for (int producto = 0; producto<listaSuper.length; producto++) {
                	System.out.println(listaSuper[producto]);
                }
        // Ejercicio 2
       // Escribir un programa que pida al usuario un numero entero y muestre por pantalla si es un numero primo o no
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        sc.close();
        
        boolean esPrimo = esPrimo(num);
        
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }
    
    public static boolean esPrimo(int num) {
        int i = 2;
        while (i <= Math.sqrt(num) && num % i != 0) {
            i++;
        }
        return i > Math.sqrt(num);        
        
    }   

}
		
		
	





/*

Estructuras repetitivas o ciclos

	- While (mientras)
	- do while (hacer mientras)
	- for (para)

		
		
While (mientras)

Es un ciclo o una condicion que se comprueba al inicio del bucle, por lo que las instrucciones que lo forman se ejecutan 0 o mas veces
		
		
		Sintaxis
		
		While (Condicion)	
		



Do While (Hacer mientras)

codigo:

do {
	codigo;

} while (condicion);

otro codigo;
		



For (para)


  /* For (inicializacion; condicion; actualizacion){
         * ....
         * }
         

Inicializacion: expresion que se ejecuta al inicio del bucle, generalmente se usa para inicializar el contador

condicion: Expresion booleana que se evalua en cada iteracion (cada vuelta), si la condicion es verdadera, se ejecuta el bloque de codigo. Si es falsa, se sale del ciclo.

actualizacion: la expresion del principio se ira actualizando al final de cada iteracion

*/

		
		
		
		
*/


		
