package semana1;

import java.util.List;

public class Ejecutar {
	public static void main(String[]args) {
		List<Tarea> tareas =
		List.of(
				new TareaDeAlimentacion("Porcion de alimento matutina", true, "Gastrointestinal lata", 200.0),
				new TareaDeAdministrarMedicinas("Antibiotico", true, "Amoxicilina", "Media pastilla")
		);

		for (Tarea tarea : tareas) {
			System.out.println(tarea.obtenerDetallesTarea());
		}

		
	}
	
}
