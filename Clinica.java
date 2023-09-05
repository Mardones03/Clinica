package modelo;

import java.util.ArrayList;

public class Clinica {
	private String nombreClinica;
	private String direccionClinica;
	private String tipoClinica;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	public Clinica(String nombreClinica, String direccionClinica, String tipoClinica) {
		this.nombreClinica = nombreClinica;
		this.direccionClinica = direccionClinica;
		this.tipoClinica = tipoClinica;
	}

	public String getNombreClinica() {
		return this.nombreClinica;
	}

	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
	}

	public String getDireccionClinica() {
		return this.direccionClinica;
	}

	public void setDireccionClinica(String direccionClinica) {
		this.direccionClinica = direccionClinica;
	}

	public String getTipoClinica() {
		return this.tipoClinica;
	}

	public void setTipoClinica(String tipoClinica) {
		this.tipoClinica = tipoClinica;
	}

	public ArrayList<Medico> obtenerMedicos() {
		ArrayList<Medico> medicos = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Medico) {
				medicos.add((Medico) trabajador);
			}
		}
		return medicos;
	}

	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo> administrativos = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}


	public ArrayList<Medico> obtenerMedicosEspecialidad(EspecialidadMedica especializacion) {
		ArrayList<Medico> medicosPorEspecialidad = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Medico) {
				Medico medico = (Medico) trabajador;
				if (medico.getEspecialidadMedica().equals(especializacion)) {
					medicosPorEspecialidad.add(medico);
				}
			}
		}
		return medicosPorEspecialidad;
	}


	public ArrayList<Administrativo> obtenerAdministrativosEspecialidad(EspecialidadMedica especializacion) {
		ArrayList<Administrativo> administrativosPorEspecialidad = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				Administrativo administrativo = (Administrativo) trabajador;
				if (administrativo.getEspecialidadMedica().equals(especializacion)) {
					administrativosPorEspecialidad.add(administrativo);
				}
			}
		}
		return administrativosPorEspecialidad;
	}
	public static Clinica iniciarClinica() {
		// Crear una instancia de la clínica
		Clinica Clinica = new Clinica("Clinica", "Uruguay 203", "Privada");
		EspecialidadMedica Anestesiologo = new EspecialidadMedica("Anestesiologo");
		EspecialidadMedica Pediatra = new EspecialidadMedica("Pediatra");
		// Crear médicos y administrativos
		Medico medico1 = new Medico("Médico", "Dr. Ariel", "Los Perales 233", "Casado", "104458229", "10am/16pm", Pediatra);
		Medico medico2 = new Medico("Médico", "Dra. Sandra", "San Luis 100", "Casada", "113378857", "10am/16pm",  Pediatra);

		Administrativo admin1 = new Administrativo("Administrativo", "Cristobal", "Holanda 111", "Soltero", "45766559", "9am/15pm", "Cristobal@clinica.com", Anestesiologo);
		Administrativo admin2 = new Administrativo("Administrativo", "German", "Lirales 550", "Casado", "127344338", "9am/15pm", "German@clinica.com", Pediatra);


		Clinica.trabajadores.add(medico1);
		Clinica.trabajadores.add(medico2);
		Clinica.trabajadores.add(admin1);
		Clinica.trabajadores.add(admin2);


		System.out.println("Datos de la Clínica:");
		System.out.println("Nombre de la Clínica: " + Clinica.getNombreClinica());
		System.out.println("Dirección de la Clínica: " + Clinica.getDireccionClinica());
		System.out.println("Tipo de Clínica: " + Clinica.getTipoClinica());


		System.out.println("\nMédicos en la clínica:");
		for (Medico medico : Clinica.obtenerMedicos()) {
			System.out.println("Nombre: " + medico.getNombreTrabajador());
			System.out.println("Especialización Médica: " + medico.getEspecialidadMedica().getNombreEspecialidad());
		}


		System.out.println("\nAdministrativos en la clínica:");
		for (Administrativo admin : Clinica.obtenerAdministrativos()) {
			System.out.println("Nombre: " + admin.getNombreTrabajador() + ", Correo Electronico: " + admin.getCorreoElectronico());
			System.out.println("Especialización Médica: " + admin.getEspecialidadMedica().getNombreEspecialidad());
		}


		System.out.println("\nMédicos por especialidad (Pediatria):");
		for (Medico medico : Clinica.obtenerMedicos()) {
			if (medico.getEspecialidadMedica().equals(Pediatra)) {
				System.out.println("Nombre: " + medico.getNombreTrabajador());
			}
		}

		System.out.println("\nMédicos por especialidad (Anestesiologia):");
		ArrayList<Medico> medicosDermatologos = Clinica.obtenerMedicosEspecialidad(Anestesiologo);
		for (Medico medico : medicosDermatologos) {
			System.out.println("Nombre: " + medico.getNombreTrabajador());
		}


		System.out.println("\nAdministrativos por especialidad (Pediatria):");
		ArrayList<Administrativo> administrativosCirujanos = Clinica.obtenerAdministrativosEspecialidad(Pediatra);
		for (Administrativo admin : administrativosCirujanos) {
			System.out.println("Nombre: " + admin.getNombreTrabajador());
		}

		System.out.println("\nAdministrativos por especialidad (Anestesiologia):");
		ArrayList<Administrativo> administrativosDermatologos = Clinica.obtenerAdministrativosEspecialidad(Anestesiologo);
		for (Administrativo admin : administrativosDermatologos) {
			System.out.println("Nombre: " + admin.getNombreTrabajador());
		}

		return Clinica;
	}

}
