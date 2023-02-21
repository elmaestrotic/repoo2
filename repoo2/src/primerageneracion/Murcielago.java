package primerageneracion;

public interface Murcielago extends Mamifero{
    public void volar();

    default void comerFrutas(){
        System.out.println("comiendo frutas.");
    }

    static void dormirDeCabeza(){
        System.out.println("Dormir de cabeza abajo.");
    }

}
