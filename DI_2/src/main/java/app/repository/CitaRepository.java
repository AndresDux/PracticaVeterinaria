package app.repository;
import app.domain.Cita;

import java.util.List;

interface CitaRepository {
    public void guardarCita(Cita cita);  //Mét.odo abstracto para guardar cita.

    public List<Cita> mostrarCitas();  //Mét.odo para mostrar las citas.
}