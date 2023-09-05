package modelo;



public class EspecialidadMedica {
	private String nombreEspecialidad;
	public EspecialidadMedica(String nombreEspecialidad){
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public EspecialidadMedica() {

	}

	public String getNombreEspecialidad() {
		return this.nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
}