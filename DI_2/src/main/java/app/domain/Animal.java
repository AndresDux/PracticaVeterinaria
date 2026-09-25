package app.domain;

public abstract class Animal {  //todo: CLASE ABSTRACTA
    private int idAnimal;
    private String nombre;
    private int edad;


    //CONSTRUCTOR:
    public Animal(int idAnimal, String nombre, int edad) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.edad = edad;
    }

    //GETTERS:
    public int getIdAnimal() {return idAnimal;}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


//    public abstract int edad();



    //PARA QUE EL TOSTRING MUESTRE LOS DATOS AL HACER System.out.println(repositorio.obtenerTodos());:
//    @Override
//    public String toString() {
//        return "Nombre: " + name +
//                ", Edad: " + age;
//    }
}
