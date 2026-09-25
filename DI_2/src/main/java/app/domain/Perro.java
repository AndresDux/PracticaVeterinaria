package app.domain;

public class Perro extends Animal {
    private final String raza;

    //CONSTRUCTOR:
    public Perro(int id, String nombre, int edad, String raza) {
        super(id, nombre, edad);
        this.raza = raza;
    }

    //GETTERS:
    public String getRaza() {
        return raza;
    }

//    @Override
//    public int edad() {
//        return 0;
//    }
}
