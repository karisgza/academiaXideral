package semana1;

public class Mascota {
	private String id;
	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String notasMedicas;
	private Dueno dueno;
	
	public Mascota(String id, String nombre, String tipo, String raza, int edad, String notasMedicas, Dueno dueno) {
		this.id=id;
		this.nombre=nombre;
		this.tipo=tipo;
		this.raza=raza;
		this.edad=edad;
		this.notasMedicas=notasMedicas;
		this.dueno=dueno;
	}
	public String getID() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String getRaza() {
		return raza;
	}
	public int getEdad() {
		return edad;
	}
	public String getNotasMedicas() {
		return notasMedicas;
	}
	public Dueno getDueno() {
		return dueno;
	}

}
