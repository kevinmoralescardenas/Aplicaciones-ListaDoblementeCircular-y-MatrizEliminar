package MatrizEliminar;

public class MatrizLista {
    Nodo cabeza;

    public void eliminar(int fila, int columna)
    {
        if (cabeza == null)
        {
            System.out.println("No hay asientos registrados.");
            return;
        }

        // Caso 1: el asiento a eliminar es la cabeza
        if (cabeza.fila == fila && cabeza.columna == columna)
        {
            cabeza = cabeza.siguiente;
            System.out.println("Asiento liberado.");
            return;
        }

        // Caso 2: buscar el asiento
        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null)
        {
            if (actual.fila == fila && actual.columna == columna)
            {
                anterior.siguiente = actual.siguiente;
                System.out.println("Asiento liberado.");
                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        System.out.println("El asiento no esta ocupado.");
    }


    //esto no se expone



    public void mostrar()
    {
        Nodo actual = cabeza;

        System.out.println("\nAsientos registrados:");

        while (actual != null)
        {
            System.out.println(
                    "Fila: " + actual.fila +
                            " | Columna: " + actual.columna +
                            " | Cliente: " + actual.cliente
            );

            actual = actual.siguiente;
        }
    }
}
