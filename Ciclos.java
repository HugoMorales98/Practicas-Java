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

        
        // Ejercicio 2
       // Escribir un programa que pida al usuario un numero entero y muestre por pantalla si es un numero primo o no
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();  // Lee un número entero desde la entrada estándar
        sc.close();  // Cierra el objeto Scanner
        
        boolean esPrimo = esPrimo(num);  // Llama a la función esPrimo y guarda el resultado en la variable esPrimo
        
        // Utiliza la estructura switch para imprimir el mensaje adecuado según el valor de esPrimo
        switch (esPrimo) {
            case true:
                System.out.println(num + " es un número primo.");
                break;
            case false:
                System.out.println(num + " no es un número primo.");
                break;
        }
    }
    
    // Función que determina si un número es primo o no
    public static boolean esPrimo(int num) {
        int i = 2;
        while (i <= Math.sqrt(num) && num % i != 0) {  // Itera desde 2 hasta la raíz cuadrada de num buscando un divisor
            i++;
        }
        return i > Math.sqrt(num);  // Si no se encontró un divisor, el número es primo y se devuelve true; de lo contrario, se devuelve false
        
        
		
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

		
		
*/