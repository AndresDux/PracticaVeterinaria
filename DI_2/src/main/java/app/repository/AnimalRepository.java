package app.repository;

import app.domain.Animal;
import java.util.List;
import java.util.ArrayList;

public class AnimalRepository {
    private List<Animal> animales = new ArrayList<>();

    public void guardarAnimal(Animal animal) {
        animales.add(animal);
    }

//    public List<Animal> obtenerTodos() {
//        return animales;
//    }

}
