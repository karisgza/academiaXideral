package semana1;

public class Dueno {
	private String id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String telefonoEmergencia;
    
    public Dueno(String id, String nombre, String telefono, String direccion, String telefonoEmergencia) {
    	this.id=id;
    	this.nombre=nombre;
    	this.telefono = telefono;
    	this.direccion=direccion;
    	this.telefonoEmergencia=telefonoEmergencia;
    }
    
    public String getID() {
    	return id;
    }
    public String getNombre() {
    	return nombre;
    }
    public String getTelefono() {
    	return telefono;
    }
    public String getDireccion() {
    	return direccion;
    }
    public String getTelefonoEmergencia() {
    	return telefonoEmergencia;
    }

}
