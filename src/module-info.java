/**
 * 
 */
/**
 * 
 */
module RadioCare {
	
	    requires com.google.gson; // pour que projet connait gson

	    opens radiocare.entities to com.google.gson; // gson lit et ecrit champs des entities
	
}