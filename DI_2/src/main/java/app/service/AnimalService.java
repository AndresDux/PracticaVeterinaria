package app.service;

import app.domain.Animal;
import app.repository.AnimalRepository;

public class AnimalService {
    private AnimalRepository repositorio;

    public AnimalService(AnimalRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void guardarAnimal(Animal animal) {
        repositorio.guardarAnimal(animal);
    }
}
