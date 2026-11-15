package radiocare.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 * gson ne sait pas convertir un localdate tout seul
 *  cette adaptateur lui explique comment  le faire
 */

public class LocalDateAdapter extends TypeAdapter<LocalDate> {
    @Override
    public void write(JsonWriter out, LocalDate value) throws IOException {
        if (value == null) out.nullValue(); // date absente cad null dans le JSON
        else out.value(value.toString()); // date s'ecrit sous la forme "annee-mois-jour"
    }

    @Override
    public LocalDate read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) { in.nextNull(); return null; }
        return LocalDate.parse(in.nextString());
    }
}