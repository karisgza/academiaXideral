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

}
