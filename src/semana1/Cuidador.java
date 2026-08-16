package semana1;

public class Cuidador {
	private String id;
	private String nombre;
	private String correo;
	private String telefono;
	
	public Cuidador(String id, String nombre, String correo, String telefono) {
		this.id=id;
		this.nombre=nombre;
		this.correo=correo;
		this.telefono=telefono;
	}
	public String getID() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String correo() {
		return correo;
	}
	public String telefono() {
		return telefono;
	}

}
