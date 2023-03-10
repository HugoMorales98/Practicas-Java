// 1. Escribir mostrar en pantalla los primeros 100 numeros primos


public class PrimerosCienPrimos {
    public static boolean esPrimo(int numero) {
        /*
         * Función para verificar si un número es primo o no
         */
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Imprimir los primeros 100 números primos
        int numPrimos = 0;
        int num = 2;
        while (numPrimos < 100) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                numPrimos++;
            }
            num++;
        }
    }
}

// 2. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

public static int sumarSinOperadores(int a, int b) {
    if(b == 0) {
        return a;
    }
    int suma = a ^ b;
    int acarreo = (a & b) << 1;
    return sumarSinOperadores(suma, acarreo);
}

// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo

public static boolean esPalindromo(int n) {
    if(n < 10 || n > 99) {
        return false;
    }
    return n / 10 == n % 10;
}

// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10

public static int sumarDigitos(int n) {
    if(n < 10) {
        return n;
    }
    return sumarDigitos(n / 10) + (n % 10);
}

// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"

public static String removerEspacios(String cadena) {
    return cadena.replaceAll("\\s", "");
}

// 15. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops

public static String invertirString(String cadena) {
    if(cadena.length() <= 1) {
        return cadena;
    }
    return invertirString(cadena.substring(1)) + cadena.charAt(0);
}


// 16. Escribir un metodo para encontrar el factorial de un numero sin loops

public static int calcularFactorial(int n) {
    if(n == 0) {
        return 1;
    }
    return n * calcularFactorial(n - 1);
}