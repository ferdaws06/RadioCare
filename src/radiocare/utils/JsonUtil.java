package radiocare.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.*;

/**
 * cette classe lit et écrit une liste d'objets
 * (Patient, Medecin, ...) dans un fichier JSON.
 */
public class JsonUtil {

    // Objet Gson configuré une seule fois pour toute la classe
    private static final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter()) // gestion des dates
            .setPrettyPrinting()                                          // JSON bien indenté et lisible
            .create();

    /**
     * Lit un fichier JSON et renvoie la liste d'objets correspondante.
     * @param fichier nom du fichier (ex: "patients.json")
     * @param classe  type des objets (ex: Patient.class)
     */
    public static <T> List<T> lire(String fichier, Class<T> classe) {
        File f = new File(fichier);

        // Si le fichier n'existe pas encore, on renvoie une liste vide
        if (!f.exists()) return new ArrayList<>();

        try (Reader r = new FileReader(f)) {
            // Construit le type "List<classe>" (Java efface les génériques à l'exécution)
            Type type = TypeToken.getParameterized(List.class, classe).getType();

            // Convertit le JSON en liste d'objets
            List<T> liste = gson.fromJson(r, type);

            // Si le fichier est vide, gson renvoie null -> on renvoie une liste vide
            return liste != null ? liste : new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException("Erreur lecture " + fichier, e);
        }
    }

    /**
     * Écrit la liste d'objets dans un fichier JSON (écrase l'ancien contenu).
     */
    public static <T> void ecrire(String fichier, List<T> liste) {
        try (Writer w = new FileWriter(fichier)) {
            gson.toJson(liste, w); // convertit la liste en JSON et l'écrit
        } catch (IOException e) {
            throw new RuntimeException("Erreur écriture " + fichier, e);
        }
    }
}
