package modelo;

public class Medico extends Trabajador {

	private EspecialidadMedica especialidadMedica;

	public Medico(String tituloProf, String nombreTrabajador, String direccionTrabajador, String estadoCivil, String rut, String horarioTrabajo, EspecialidadMedica especialidadMedica) {
		super(tituloProf, nombreTrabajador, direccionTrabajador, estadoCivil, rut, horarioTrabajo);
		this.especialidadMedica = new EspecialidadMedica();
	}


	public EspecialidadMedica getEspecialidadMedica(){
		return this.especialidadMedica;
	}
	public void setEspecializacionMedica(EspecialidadMedica especialidadMedica){
		this.especialidadMedica= especialidadMedica;
	}

	public String getTipo() {
		return "Medico";
	}

}