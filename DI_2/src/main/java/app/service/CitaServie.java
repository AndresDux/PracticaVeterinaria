package app.service;

import app.domain.Animal;
import app.domain.Cita;
import app.domain.EstadoCita;
import app.repository.CitaRepository;

public class CitaServie {
    private final CitaRepository citaRepository;  //Llamamos a CitaRepository para poder usarlo en el const.


    public CitaServie(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public String crearCita(Cita nuevaCita) {
        int idAnimal = nuevaCita.getAnimal().getIdAnimal();
        String nombreVeterinario = nuevaCita.getVeterinario().getNombre();
        EstadoCita estadoCita = nuevaCita.getEstadoCita();

        if (estadoCita != estadoCita.PROGRAMADA) {
            return "Cita Cancelada";
        }

        this.citaRepository.guardarCita(nuevaCita);
        return "El animal con el ID: " + idAnimal + " tiene una cita asignada con el veterinario de ID: " + nombreVeterinario;
    }
}