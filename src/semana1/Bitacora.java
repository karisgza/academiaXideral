package semana1;

import java.time.LocalDateTime;

public class Bitacora {
	private String id;
	private Tarea tarea;
	private EstadoTarea estado;
	private LocalDateTime fechaCompletada;
	private String notas;
	private String URLFoto;
	
	public Bitacora(Tarea tarea) {
		this.id=java.util.UUID.randomUUID().toString();
		this.tarea=tarea;
		this.estado=EstadoTarea.PENDIENTE;
	}
	public void completarTarea(String notas, String URLFoto) {
		this.estado=EstadoTarea.COMPLETADA;
		this.fechaCompletada = LocalDateTime.now();
		this.notas=notas;
		this.URLFoto=URLFoto;
	}
	public String getID() {
		return id;
	}
	public Tarea getTarea() {
		return tarea;
	}
	public EstadoTarea getEstado() {
		return estado;
	}
	public LocalDateTime getFechaCompletada() {
		return fechaCompletada;
	}
	public String getNotas() {
		return notas;
	}
	public String getURLFoto() {
		return URLFoto;
	}

}
