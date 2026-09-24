package app.domain;

public class Gato extends Animal {
    private String color;

    //CONSTRUCTOR:
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    //GETTERS:
    public String getColor() {
        return color;
    }
}
