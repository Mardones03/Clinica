package modelo;

public abstract class Trabajador {
	private String tituloProf;
	private String nombreTrabajador;
	private String direccionTrabajador;
	private String estadoCivil;
	private String rut;
	private String horarioTrabajo;
	public Trabajador(String tituloProf, String nombreTrabajador, String direccionTrabajador, String estadoCivil, String rut, String horarioTrabajo){
		this.tituloProf = tituloProf;
		this.nombreTrabajador = nombreTrabajador;
		this.direccionTrabajador = direccionTrabajador;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horarioTrabajo = horarioTrabajo;
	}

	public String getTituloProf() {
		return this.tituloProf;
	}

	public void setTituloProf(String tituloProf) {
		this.tituloProf = tituloProf;
	}

	public String getNombreTrabajador() {
		return this.nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public String getDireccionTrabajador() {
		return this.direccionTrabajador;
	}

	public void setDireccionTrabajador(String direccionTrabajador) {
		this.direccionTrabajador = direccionTrabajador;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public abstract String getTipo();

	public String getHorarioTrabajo() {
		return this.horarioTrabajo;
	}

	public void setHorarioTrabajo(String horarioTrabajo) {
		this.horarioTrabajo = horarioTrabajo;
	}
}