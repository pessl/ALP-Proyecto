package test;

import org.junit.Test;
import pageobjects.formularioPage;
import support.filecsv;
import support.util;

import java.io.IOException;

import static support.evidencias.screenshot;

public class formularioTest extends util {
    formularioPage formulario;

    public formularioTest() {
        formulario = new formularioPage();
    }

    @Test
    public void primerTest() throws IOException {
        ingresarUrl("http://testautomationpractice.blogspot.com/");
        formulario.iframe("frame-one1434677811");
        formulario.escribirNombre("Pedro");
        formulario.escribirApellido("Perez");
        formulario.escribirTelefono("999888777");
        formulario.escribirPais("Perú");
        screenshot();
        formulario.escribirCiudad("Lima");
        formulario.escribirEmail("pperez@gmail.com");
        formulario.seleccionarGenero("Masculino");
        formulario.seleccionarDias("Monday-Friday-Sunday");
        formulario.seleccionarTiempo("Morning");
        screenshot();
        formulario.cargarArchivo("C:\\Users\\PESSL\\Downloads\\selenium.txt");
        //screenshot();
        formulario.clickGuardar();
    }

    @Test
    public void csvTest() throws IOException {
        driver.get("http://testautomationpractice.blogspot.com/");

        filecsv.leerCSV("sebastian");

        formulario.iframe("frame-one1434677811");

        formulario.escribirNombre(filecsv.nombre);
        formulario.escribirApellido(filecsv.apellido);
        formulario.escribirTelefono(filecsv.telefono);
        formulario.escribirPais(filecsv.pais);
        screenshot();
        formulario.escribirCiudad(filecsv.ciudad);
        formulario.escribirEmail(filecsv.email);
        formulario.seleccionarGenero(filecsv.genero);
        formulario.seleccionarDias(filecsv.dias);
        formulario.seleccionarTiempo(filecsv.tiempo);
        screenshot();
        formulario.cargarArchivo(filecsv.archivo);
        //screenshot();
        formulario.clickGuardar();
    }
}