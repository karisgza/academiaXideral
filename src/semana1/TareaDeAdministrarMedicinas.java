package semana1;

public class TareaDeAdministrarMedicinas extends Tarea {
	private String nombreMedicina;
	private String dosis;
	
	public TareaDeAdministrarMedicinas(String nombre, boolean esObligatoria, String nombreMedicina, String dosis) {
		super(nombre, esObligatoria);
		this.nombreMedicina=nombreMedicina;
		this.dosis=dosis;
	}
	
	public String obtenerDetallesTarea() {
		return "Se administraron: " +dosis+" de "+nombreMedicina;
	}
	
	public boolean validarEstado(Bitacora bitacora) {
		//La administracion de un medicamento requiere foto
		return bitacora.getURLFoto() != null && !bitacora.getURLFoto().isBlank();
	}
}
