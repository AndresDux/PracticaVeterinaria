package app.domain;

import app.repository.AnimalRepository;
import app.service.AnimalService;

public class App {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Lukas", 3, "Labrador");

        AnimalRepository repositorio = new AnimalRepository();

        AnimalService service = new AnimalService(repositorio);

        repositorio.guardarAnimal(perro1);

//        System.out.println(repositorio.obtenerTodos());
    }
}
