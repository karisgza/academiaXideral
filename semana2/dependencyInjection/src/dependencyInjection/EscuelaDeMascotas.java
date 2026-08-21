package dependencyInjection;

public class EscuelaDeMascotas {
	private final Mascota alumno;
	
	public EscuelaDeMascotas(Mascota alumno) {
		this.alumno=alumno;
	}
	
	public void paseDeLista() {
		System.out.println("Mascota, favor de decir presente");
		alumno.hablar();
	}

}
