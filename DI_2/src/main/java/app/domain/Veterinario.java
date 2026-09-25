package app.domain;

public class Veterinario {
    //ATRIBUTOS:
    private int idVeterinario;
    private String nombre;

    //CONSTRUCTOR:
    public Veterinario(int idVeterinario, String nombre) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
    }


    //GETTERS:
    public String getNombre() {
        return nombre;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }
}
