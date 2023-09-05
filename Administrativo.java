package modelo;

import modelo.EspecialidadMedica;

public class Administrativo extends Trabajador {
	private String correoElectronico;
	private EspecialidadMedica especialidadMedica;

	public Administrativo(String tituloProf, String nombreTrabajador, String direccionTrabajador, String estadoCivil, String rut, String horarioTrabajo, String correoElectronico, EspecialidadMedica especialidadMedica) {
		super(tituloProf, nombreTrabajador, direccionTrabajador, estadoCivil, rut, horarioTrabajo);
		this.correoElectronico = correoElectronico;
		this.especialidadMedica = especialidadMedica;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public EspecialidadMedica getEspecialidadMedica(){
		return this.especialidadMedica;
	}
	public void setEspecialidadMedica(EspecialidadMedica especialidadMedica){
		this.especialidadMedica= especialidadMedica;
	}

	public String getTipo() {
		return "Administrativo";
	}
}