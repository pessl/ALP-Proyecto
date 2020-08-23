package test;

import org.junit.Test;
import pageobjects.lateralPage;
import support.util;

public class lateralTest extends util {
    lateralPage lateral;

    public lateralTest() {
        lateral = new lateralPage();
    }

    @Test
    public void validarAlertaTest() {
        driver.get("http://testautomationpractice.blogspot.com/");
        lateral.clickAlerta();
        lateral.obtenerTextoAlerta();
        //lateral.aceptarAlerta();
        lateral.cancelarAlerta();
        //lateral.validarMensaje("You pressed OK!");
        lateral.validarMensaje("You pressed Cancel!");
    }

    @Test
    public void trabajoVentanaTest() throws InterruptedException {
        driver.get("http://testautomationpractice.blogspot.com/");
        lateral.escribirTexto("pruebas");
        lateral.clickBuscar();
        lateral.clickLink();
        lateral.nuevaVentana();
        lateral.validarTitulo();
        lateral.ventanaInicial();
    }
}