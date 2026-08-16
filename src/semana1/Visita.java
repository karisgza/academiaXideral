package semana1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Visita {
    private String id;
    private Cuidador cuidador;
    private Mascota mascota;
    private LocalDateTime horaDeComienzoProgramada;
    private LocalDateTime horaDeTerminoProgramada;
    private LocalDateTime horaDeComienzoActual;
    private LocalDateTime horaDeTerminoActual;
    private EstadoVisita estado;
    private List<Bitacora> bitacora;
    private String notas;
    
    public Visita(Cuidador cuidador, Mascota mascota, LocalDateTime horaDeComienzoProgramada, LocalDateTime horaDeComienzoActual, LocalDateTime horaDeTerminoProgramada, LocalDateTime horaDeTerminoActual,EstadoVisita estado, List<Bitacora> bitacora, String notas) {
    	this.id= java.util.UUID.randomUUID().toString();
    	this.cuidador=cuidador;
    	this.mascota=mascota;
    	this.horaDeComienzoProgramada=horaDeComienzoProgramada;
    	this.horaDeComienzoActual=horaDeComienzoActual;
    	this.horaDeTerminoProgramada=horaDeTerminoProgramada;
    	this.horaDeTerminoActual=horaDeTerminoActual;
    	this.estado=EstadoVisita.PROGRAMADA;
    	this.bitacora=new ArrayList<>();
    	this.notas=notas;
    }
    
    public void agregarTarea(Tarea tarea) {
    	this.bitacora.add(new Bitacora(tarea));
    }
    
    public void comenzarVisita() {
    	this.estado=EstadoVisita.EN_PROGRESO;
    	this.horaDeComienzoActual=LocalDateTime.now();
    	
    }
    
    public void completarVisita(String notas) {
    	this.estado=EstadoVisita.COMPLETADA;
    	this.horaDeTerminoActual=LocalDateTime.now();
    	this.notas=notas;
    }

    public boolean tareasCompletadas() {
    	//Logica para identificar tareas completadas
    	return true;
    }

    public String getID() {
    	return id;
    }
    
    public Cuidador getCuidador() {
    	return cuidador;
    }
    
    public Mascota getMascota() {
    	return mascota;
    }
    
    public LocalDateTime getHoraDeComienzoProgramada() {
    	return horaDeComienzoProgramada;
    }
    
    public LocalDateTime getHoraDeComienzoActual() {
    	return horaDeComienzoActual;
    }
    
    public LocalDateTime getHoraDeTerminoProgramada() {
    	return horaDeTerminoProgramada;
    }
    
    public LocalDateTime getHoraDeTerminoActual() {
    	return horaDeTerminoActual;
    }
    
    public EstadoVisita getEstadoVisita() {
    	return estado;
    }
    
    public List<Bitacora> getBitacora() {
    	return bitacora;
    }
    
    public String getNotas() {
    	return notas;
    }

   
}