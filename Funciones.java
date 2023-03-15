package Funciones;

import java.util.Scanner;

public class Funciones {

	//Ejemplo de una funcion que no retorna nada (void)
		public static void imprimirAsteriscos() {
			System.out.println("*********************************");
		}

	
	// Funcion para sumar dos valores
		public static int sumar (int num1, int num2) {
			int resultado = num1 + num2;
			return resultado;			
		}
		
		static int [] numeros = {8, 1, 2, 3, 4 , 4, 9, 9, 6};
		// Funcion que toma un arreglo y nos devuelve el numero mas grande
		
		public static int numeroMasGrande(int[]numeros) { // usamos el arreglo como argumento de mi funcion
			int maximo = numeros[0]; // declaro mi valor inicial en 0
			//CICLO PARA RECORREL EL ARREGLO OBTENER EL NUMERO MAS GRANDE
			for (int i=1; i<numeros.length; i++) { //iniciao mi indice en 1, mientras el indice sea menor a la longitud de mi arrego,
				//cada que se cumple aumento mi indice de 1 en 1
				
				// Si el indice del arreglo "numeros" es mayor que el valor que tengo asignado en la variable "maximo", entonces ese valor se va a sobreescribir
				//o reasignar con ese indice
				if (numeros[i]> maximo) {
					maximo = numeros[i];
				}
		}
			
			return maximo;
				
			}		
		
		
		
		
		
	public static void main(String[] args) {
		
		imprimirAsteriscos();
		System.out.println("La suma de mis valores es: " + sumar(5,8));
		imprimirAsteriscos();
		System.out.println("El valor dmaximo de mi arreglo es: " + numeroMasGrande(numeros));
		// TODO Auto-generated method stub
	
		
Scanner input = new Scanner(System.in); // crear un objeto Scanner para leer la entrada del usuario
        
        int numero; // declarar la variable numero
        do { // comenzar un ciclo do-while
            System.out.print("Ingrese un número (0 para salir): "); // solicitar al usuario que ingrese un número
            numero = input.nextInt(); // leer el número ingresado por el usuario desde la entrada estándar
            
            if (numero != 0) { // si el número ingresado no es cero
                int suma = sumarDigitos(numero); // llamar a la función sumarDigitos para obtener la suma de los dígitos del número ingresado
                System.out.println("La suma de los dígitos es: " + suma); // mostrar el resultado de la suma de los dígitos en la consola
            }
        } while (numero != 0); // repetir el ciclo mientras el número ingresado no sea cero
        
        input.close(); // cerrar el objeto Scanner
    }
    
    public static int sumarDigitos(int numero) { // definir la función sumarDigitos que toma un parámetro de tipo int llamado numero
        int suma = 0; // declarar la variable suma e inicializarla en cero
        while (numero != 0) { // comenzar un ciclo while que se repite mientras el número no sea cero
            suma += numero % 10; // sumar el último dígito del número a la variable suma
            numero /= 10; // dividir el número por diez para eliminar el último dígito
        }
        return suma; // devolver el valor de la variable suma
		
			
		
		
		
		
		/*
		 *  Funciones
		 *  
		 *  
		 *  Tenemos dos tipos de funciones: 
		 *  
		 *  	- Funciones que devuelven un valor: Debe especificar el tipo de dato que vamos a usar, utilizar una clausula "return" para devolver el valor. Los parametros deben coincidir con el tipo de dato especificado.
		 *  
		 *  
		 *  	- Funcines que NO devuelven nada (void): No necesitamos especificar nada, y no utilizamos la clausula "return". 
		 * 
		 * 
		 * 
		 */
