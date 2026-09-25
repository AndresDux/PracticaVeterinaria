package app.domain;

public class Animal {
    private String nombre;
    private int edad;


    //CONSTRUCTOR:
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //GETTERS:
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }






    //PARA QUE EL TOSTRING MUESTRE LOS DATOS AL HACER System.out.println(repositorio.obtenerTodos());:
//    @Override
//    public String toString() {
//        return "Nombre: " + name +
//                ", Edad: " + age;
//    }
}
