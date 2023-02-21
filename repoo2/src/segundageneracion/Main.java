package segundageneracion;

import primerageneracion.Murcielago;
import segundageneracion.Dracula;

public class Main {
    public static void main(String[] args) {
        Dracula obj1 = new Dracula("Dracula", 1000, 200);
        obj1.morder();//heredado de la clase padre->Vampiro
        obj1.chuparSangre();//heredado de la clase padre->Vampiro
        obj1.hipnotizar();//método propio de la clase hija->Dracula
        obj1.volar();//método de la interfaz->Murcielago
        obj1.comerFrutas();//método opcional de la interfaz->Murcielago

        Murcielago.dormirDeCabeza();//método estático de la interfaz->Murcielago
        obj1.amamantar();//método de la interfaz->Mamifero
    }
}