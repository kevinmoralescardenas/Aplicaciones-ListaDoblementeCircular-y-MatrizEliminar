package ListaCircularDoblementeEnlazada;

public class CambiarVentanas {
    Nodo cabeza;

    /* Insertar ventana en lista circular doble */
    public void insertar(String dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {

            //[this | Chrome | this]
            cabeza = nuevo;
            cabeza.anterior = nuevo;
            cabeza.siguiente = nuevo;
            //[Chrome | Chrome | Chrome]

        } else {

            Nodo ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;

        }
    }

    /* Recorrer ventanas hacia adelante */
    public void recorrerAdelante() {

        if (cabeza == null) {
            System.out.println("No hay ventanas abiertas");
            return;
        }

        Nodo actual = cabeza;

        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("(vuelve a cabeza)");
    }

    /* Simular Alt + Tab */
    public void altTab() {

        if (cabeza == null) {
            System.out.println("No hay ventanas abiertas");
            return;
        }

        cabeza = cabeza.siguiente;

        System.out.println("Ventana actual: " + cabeza.dato);
    }

    /* Simular Alt + Shift + Tab */
    public void altShiftTab() {

        if (cabeza == null) {
            System.out.println("No hay ventanas abiertas");
            return;
        }

        cabeza = cabeza.anterior;

        System.out.println("Ventana actual: " + cabeza.dato);
    }
}
