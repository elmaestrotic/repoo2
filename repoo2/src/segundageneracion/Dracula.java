package segundageneracion;

import primerageneracion.Murcielago;
import primerageneracion.Vampiro;

public class Dracula extends Vampiro  implements Murcielago {
    private int estatura;
    public Dracula(String nombre, int edad, int estatura) {
        super(nombre, edad);//atributos de la clase padre
        this.estatura = estatura;
    }

    public void hipnotizar() {
        System.out.println("Dracula Hipnotizando...");
    }

    @Override
    public void volar() {
           System.out.println("Dracula volando con ecolocalización.");
    }

    @Override
    public void amamantar() {
        System.out.println("Dracula amamantando.");
    }
}
