package ejerciciosLogicos;
import java.util.Scanner;
//import java.text.MessageFormat;


public class Practica {
	
	


	public static void main(String[] args) {
		/*////////////Primer Ejercico
		 * 
		 * 	// Creamos nueva instancia de el objeto Scanner
		Scanner myScanner = new Scanner(System.in);
		
		// Mensaje para que el usuario ingrese sus datos
		System.out.println("Enter username"); // ctrl + espacio // sysout
		
		// Guardamos en una variable String lo que ingreso el usuario en la consola
		String username = myScanner.nextLine();
		
		// Mostramos mensaje con la variable previa de manera concatenada
	System.out.println("Username is"+ username);
	
	myScanner.close();
*/	
	
	
	
	  //////////////////Segundo ejercicio
	 
	// utilizar tipo de datos primitivos para informacion personal no delicada
		
//		byte edad = 21;	// edad
//		String fecha = "24 marzo 1998";	// fecha nacimiento
//		String iniciales = "hams";	// Inciales
//		byte peso = 80;	// Peso / altura / tamaño calzado /
//		String ciudad = "Leon";	// Ciudad nacimiento
//		String nacionalidad = "Mexicana";	// Nacionalidad 
//		String signo = "Aries";	// Signo zodiacal
//		String ascendente = "Aries-Sagitario";	// Signo ascendente
//		String lunar = "no se";	// Signo lunar
//		String comida = "hamburguesa";	// Comida fav
//		String comidalista = "pizza, sushi, alitas";	// Lista de comidas fav MAX 3
//		String personalidad = "Percepcion y Juicio";	// Tipo de personalidad segun MBTI
//		String estrella = "Lyra";	// Que nombre de estrella va con uds
//
//		// MessageFormat nos permite concatenar por medio de indices diferentes variables en un String
//		String msg = MessageFormat.format("Soy: {0} \nFecha de nacimiento: {1}", iniciales, fecha);
//		
//		System.out.println(msg);
	
		int calif1 = 10;
		int calif2 = 7;
		int calif3 = 10;
		int calif4= 4;
		
		// Narrow casting manual
		double avg = ((double)calif1 + (double)calif2 + (double)calif3 + (double)calif4)/4.0;
				
				System.out.println(avg);
				
				System.out.println((double)3);
				
				
				// Comillas sencillas son para tipos de datos caracter y no string
				System.out.println('%');
				
				System.out.println(4%3);
				
				
		// Pedir 2 numeros (x), (y)
				// Enteros
				
				// 1. Convertir a double cada numero
				
				// 2. Tomar las variables enteras y convertir a datos binarios.
				
				// 3. Mostrar el numero mayor
				
				// 4. Obtener el promedio de (x) y (y)
				
		// Imprimir el resultado de cada uno
				
				// Pedir 2 numeros (x), (y) enteros
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Ingrese un numero entero para x: ");
		        int x = scanner.nextInt();
		        System.out.println("Ingrese un numero entero para y: ");
		        int y = scanner.nextInt();
		        
		        // 1. Convertir a double cada numero
		        double xDouble = (double) x;
		        double yDouble = (double) y;
		        
		        // 2. Tomar las variables enteras y convertir a datos binarios.
		        String xBinary = Integer.toBinaryString(x);
		        String yBinary = Integer.toBinaryString(y);
		        
		        // 3. Mostrar el numero mayor
		        if (x > y) {
		            System.out.println("El numero mayor es x: " + x);
		        } else if (y > x) {
		            System.out.println("El numero mayor es y: " + y);
		        } else {
		            System.out.println("Los numeros son iguales");
		        }
		        
		        // 4. Obtener el promedio de (x) y (y)
		        double promedio = (xDouble + yDouble) / 2;
		        
		        // Imprimir el resultado de cada uno
		        System.out.println("Conversion de x a double: " + xDouble);
		        System.out.println("Conversion de y a double: " + yDouble);
		        System.out.println("Conversion de x a binario: " + xBinary);
		        System.out.println("Conversion de y a binario: " + yBinary);
		        System.out.println("El promedio de x e y es: " + promedio);
		
	}
	
}
