package dependencyInjection;

public class Main {
	public static void main(String[]args) {
		Mascota alumnoLista = new Gato();
		
		EscuelaDeMascotas escuela = new EscuelaDeMascotas(alumnoLista);
		
		escuela.paseDeLista();
	}
	

}
