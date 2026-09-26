package ListaCircularDoblementeEnlazada;

public class Main {
    public static void main(String[] args) {

        CambiarVentanas ventanas = new CambiarVentanas();

        // Ventanas abiertas
        ventanas.insertar("Google Chrome");
        ventanas.insertar("Microsoft Word");
        ventanas.insertar("PowerPoint");
        ventanas.insertar("IntelliJ IDEA");

        System.out.println("Ventanas abiertas:");
        ventanas.recorrerAdelante();

        System.out.println("--- Alt + Tab ---");

        ventanas.altTab();
        ventanas.altTab();
        ventanas.altTab();
        ventanas.altTab();

        System.out.println("\n--- Alt + Shift + Tab ---");

        ventanas.altShiftTab();
        ventanas.altShiftTab();
        ventanas.altShiftTab();
    }
}
