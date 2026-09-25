package app.domain;

public class Cita {
    //ATRIBUTOS:
    private int idCita;
    private String motivo;  //vacunación, control, etc.
    //Atributos para relación de clases:
    private Veterinario veterinario;
    private Animal animal;

    //Estado (Viene del enum)
    private EstadoCita estadoCita;

    //CONSTRUCTOR:
    public Cita(int idCita, String motivo, Veterinario veterinario, Animal animal) {
        this.idCita = idCita;
        this.motivo = motivo;
        this.veterinario = veterinario;
        this.animal = animal;
//        this.estadoCita = estadoCita;
        this.estadoCita = EstadoCita.PROGRAMADA; //Por defecto está PROGRAMADA.
    }

    //GETTERS:
    public int getIdCita() {
        return idCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    //SETTERS:
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
