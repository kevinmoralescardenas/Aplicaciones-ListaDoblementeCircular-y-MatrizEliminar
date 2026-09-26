package MatrizEliminar;

public class Main {
    public static void main(String[] args)
    {
        MatrizLista cine = new MatrizLista();

        // Asientos ocupados
        Nodo asiento1 = new Nodo(1, 1, "Ana");
        Nodo asiento2 = new Nodo(1, 2, "Luis");
        Nodo asiento3 = new Nodo(1, 3, "Maria");
        Nodo asiento4 = new Nodo(2, 1, "Carlos");
        Nodo asiento5 = new Nodo(2, 2, "Pedro");

        // Crear la lista de asientos
        cine.cabeza = asiento1;
        asiento1.siguiente = asiento2;
        asiento2.siguiente = asiento3;
        asiento3.siguiente = asiento4;
        asiento4.siguiente = asiento5;

        System.out.println("=== MAPA DE ASIENTOS DEL CINE ===");

        cine.mostrar();

        // Eliminar el asiento de Luis
        System.out.println("\nEliminando asiento (1,2)...");

        cine.eliminar(1, 2);

        System.out.println("\nDespues de eliminar:");

        cine.mostrar();
    }
}
