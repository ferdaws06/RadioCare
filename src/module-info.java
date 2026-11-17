/**
 * 
 */
/**
 * 
 */
module RadioCare {
	
	    requires com.google.gson;
		requires jdk.compiler; // pour que projet connait gson

	    opens radiocare.entities to com.google.gson; // gson lit et ecrit champs des entities
	
}