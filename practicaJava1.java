package practicaJava1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practica {
	
	static void primerMetodo (int x) {
		System.out.println(x);
	}

	// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
		// Revisar si es un triángulo válido
	
	public static double areaTriangulo(double lado1, double lado2, double lado3) {
	    double s = (lado1 + lado2 + lado3) / 2;
	    double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	    return area;
	}

	public static boolean esTrianguloValido(double lado1, double lado2, double lado3) {
	    return lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2;
	}
		
		// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
		// Utilizar PI de la libreria de Java
	
	public static double areaCirculo(double radio) {
	    double area = Math.PI * Math.pow(radio, 2);
	    return area;
	}

	public static double circunferenciaCirculo(double radio) {
	    double circunferencia = 2 * Math.PI * radio;
	    return circunferencia;
	}
		
		// 3 Escribir un metodo que muestre por consola la hora del sistema
		// Utilizar e investigar la libreria de Java

	
	public static void mostrarHoraSistema() {
	    LocalDateTime ahora = LocalDateTime.now();
	    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String horaActual = ahora.format(formatoHora);
	    System.out.println("La hora actual es: " + horaActual);
	}
	
		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
		// ej 3600 = "1 hora = 60 min = 3600 seg"
		
	public static String convertirSegundosAHoraMinutosSegundos(int segundos) {
	    int horas = segundos / 3600;
	    int minutos = (segundos % 3600) / 60;
	    int segs = segundos % 60;
	    String resultado = segundos + " seg = ";
	    if (horas > 0) {
	        resultado += horas + " hora";
	        if (horas > 1) resultado += "s";
	        resultado += " = ";
	    }
	    if (minutos > 0) {
	        resultado += minutos + " min";
	        if (minutos > 1) resultado += "s";
	        resultado += " = ";
	    }
	    resultado += segs + " seg";
	    return resultado;
	    
	}
	
		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	
	public static double volumenEsfera(double radio) {
	    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
	    return volumen;
	}
		
		// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
		
	public static double volumenCono(double radio, double altura) {
	    double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
	    return volumen;
	}
	
		// 7 Encontrar el area superficial de un cubo dado un lado a

	public static double areaSuperficialCubo(double lado) {
	    double area = 6 * Math.pow(lado, 2);
	    return area;
	}
	
		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	
	
	public static boolean esBisiesto(int year) {
	    if (year % 4 != 0) {
	        return false;
	    } else if (year % 400 == 0) {
	        return true;
	    } else if (year % 100 == 0) {
	        return false;
	    } else {
	        return true;
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primerMetodo(7);
	}

}
