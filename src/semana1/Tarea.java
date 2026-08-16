package semana1;

public abstract class Tarea {
	private String id;
	private String nombre;
	private boolean esObligatoria;
	
	public Tarea(String nombre, boolean esObligatoria) {
		this.id=java.util.UUID.randomUUID().toString();
		this.nombre=nombre;
		this.esObligatoria=esObligatoria;
	}
	
	public String getID() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getEsObligatoria() {
		return esObligatoria;
	}
	
	public abstract String obtenerDetallesTarea();
	public abstract boolean validarEstado(Bitacora bitacora);

}
