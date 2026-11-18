package radiocare.utils;
import java.util.List;

public class Parametres {
	
	public static final List<String> Types =
		       List.of("IRM", "Scanner-CT", "Table-RX", "Echographe");
	public static final List <String> Status=
			List.of("En Service","En panne","En maintenance");
	public static final List<String> Types_salle =
	       List.of("IRM", "Scanner-CT", "Table-RX", "Echographe");

	public static final List<String> Status_salle =
	       List.of("Disponible", "Occupee", "Maintenance");
}
