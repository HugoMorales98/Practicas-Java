package Ciclos;

import java.util.Scanner;

public class CarritoDeCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Reuqerimientos de mi carrito
		
		/*
		 * -Imprimir la lista de productos
		 * - Pedirle al usuario que seleccione un producto		 * 
		 * - Agregar el producto al carrito		 * 
		 */

		//Listado de productos con precios
				String [] productos = {"Maruchan", "Huevito", "Galletas","CocaCola", "Chocolates"};
				double [] precios = {17.00, 45.50, 20.00, 23.20, 70.00};

				//Imprimir la lista de productos
				System.out.println("Lista de productos");
				for (int i=0; i< productos.length; i++) {
					System.out.println(i + 1 + ". " + productos[i] + " - $" + precios[i]);
				
				}
				
				// Pedir al usuario que seleccione un producto
				
			Scanner producto = new Scanner(System.in);
			System.err.println("Ingresa el numero de indice del prodcuto que quiere agrregar al carrito");
			int indiceProducto = producto.nextInt();
			
			
			// Agregar el producto al carrito
			//Agregar el producto al carrito
			String productoSeleccionado = productos[indiceProducto-1];
			double precioSeleccionado = precios[indiceProducto-1];
			System.out.println("Agregaste " + productoSeleccionado + " al carrito con el precio $" + precioSeleccionado);

	}

}
