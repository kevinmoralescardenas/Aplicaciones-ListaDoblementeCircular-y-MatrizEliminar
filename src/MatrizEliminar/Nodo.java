package MatrizEliminar;

public class Nodo {
        int fila;
        int columna;
        String cliente;
        Nodo siguiente;

        public Nodo(int fila, int columna, String cliente)
        {
            this.fila = fila;
            this.columna = columna;
            this.cliente = cliente;
            this.siguiente = null;
        }
    }

