package arbolBinarioBusqueda;

public class ClienteMainOperacionesSencillas {

	public static void main(String[] args) {
		ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
		try {
			//Agregar los datos al binario ordenado
			arbol.insertar(new Entero(10));
			arbol.insertar(new Entero(15));
			arbol.insertar(new Entero(30));
			arbol.insertar(new Entero(8));
			arbol.insertar(new Entero(5));
			arbol.insertar(new Entero(2));
			arbol.insertar(new Entero(1));
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		//Recorrido
		System.out.println("Recorridos Recursivos");
		System.out.println("Preorden");
		arbol.preorden();
		System.out.println("\nInorden");
		arbol.inorden();
		System.out.println("\nPostorden");
		arbol.postorden();
		
		//Busqueda Iterativa
		Nodo aux=arbol.buscar(new Entero(30));
		if(aux==null)
			System.out.println("\nDato no encontrado");
		else
			System.out.println("\nEncontrado el dato "+aux.getValor());
		BTreePrinter.printNode(arbol.getRaiz());
		//Busqueda recursiva
		aux=arbol.buscar2(new Entero(15));
		if(aux==null)
			System.out.println("\nDato no encontrado");
		else
			System.out.println("\nEncontrado dato: "+aux.getValor());
		//Imprimer el arbol
		BTreePrinter.printNode(arbol.getRaiz());
		//Eliminaron
		arbol.eliminar(new Entero(2));
		try {
			arbol.eliminar2(new Entero(30));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Imprime despues de eliminar
		BTreePrinter.printNode(arbol.getRaiz());
		

	}

}
