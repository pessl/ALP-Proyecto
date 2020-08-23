package support;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class filecsv {
    public static String nombre;
    public static String apellido;
    public static String telefono;
    public static String pais;
    public static String ciudad;
    public static String email;
    public static String genero;
    public static String dias;
    public static String tiempo;
    public static String archivo;

    private static String path = "src/test/resources/data/";

    public static void leerCSV(String file) throws IOException {
        String root_file = path+file+".csv";
        try (
                Reader reader = Files.newBufferedReader(Paths.get(root_file));
                CSVParser csvparser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withHeader("nombre","apellido","telefono","pais","ciudad","email","genero","dias","tiempo","archivo")
                        .withIgnoreHeaderCase().withTrim());){
            for (CSVRecord csvrecord : csvparser) {
                nombre = csvrecord.get("nombre");
                apellido = csvrecord.get("apellido");
                telefono = csvrecord.get("telefono");
                pais = csvrecord.get("pais");
                ciudad = csvrecord.get("ciudad");
                email = csvrecord.get("email");
                genero = csvrecord.get("genero");
                dias = csvrecord.get("dias");
                tiempo = csvrecord.get("tiempo");
                archivo = csvrecord.get("archivo");
            }
        }
    }
}
