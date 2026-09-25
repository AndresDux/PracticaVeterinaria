package app.domain;

public class Veterinario {
    //ATRIBUTOS:
    private int id;
    private String nombre;

    //CONSTRUCTOR:
    public Veterinario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    //GETTERS:
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
