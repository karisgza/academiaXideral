package semana1;

public class TareaDeAlimentacion extends Tarea {
	private String tipoAlimento;
	private double porcionGramos;
	
	public TareaDeAlimentacion(String ID, String nombre, boolean esObligatoria, String tipoAlimento, double porcionGramos) {
		super(ID, nombre, esObligatoria);
		this.tipoAlimento=tipoAlimento;
		this.porcionGramos=porcionGramos;
	}
	
	public String obtenerDetallesTarea() {
		return "Se alimento con: " +porcionGramos+" de "+tipoAlimento;
	}
	public boolean validarEstado(Bitacora bitacora) {
		return bitacora.getNotas() != null && bitacora.getNotas().isBlank();
	}

}
