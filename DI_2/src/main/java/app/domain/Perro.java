package app.domain;

public class Perro extends Animal {
    private final String raza;

    //CONSTRUCTOR:
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    //GETTERS:
    public String getRaza() {
        return raza;
    }
}
