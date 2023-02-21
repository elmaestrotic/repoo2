package primerageneracion;
public class Vampiro {
    // Atributos
    private String nombre;
    private int edad;


    // Métodos
    public void morder() {
        System.out.println("Vampiro Mordiendo...");
    }

    public void chuparSangre() {
        System.out.println("Vampiro Chupando sangre...");
    }
    // Constructor
    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
