package app.domain;

public class Gato extends Animal {
    private String color;

    //CONSTRUCTOR:
    public Gato(int id, String nombre, int edad, String color) {
        super(id, nombre, edad);
        this.color = color;
    }

    //GETTERS:
    public String getColor() {
        return color;
    }

//    @Override
//    public int edad() {
//        return 0;
//    }
}
