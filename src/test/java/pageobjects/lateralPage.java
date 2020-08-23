package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class lateralPage extends util {
    @FindBy(xpath = "//*[text()='Click Me']") private WebElement btnalerta;
    @FindBy(id = "demo") private WebElement lblmensaje;

    @FindBy(id = "Wikipedia1_wikipedia-search-input") private WebElement txtbuscador;
    @FindBy(className = "wikipedia-search-button") private WebElement btnbuscar;
    @FindBy(linkText = "Pruebas de Acceso a Estudios Universitarios") private WebElement lnkbusqueda;
    @FindBy(id = "firstHeading") private WebElement lblTitulo;

    public lateralPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAlerta() {
        wait.until(ExpectedConditions.elementToBeClickable(btnalerta));
        btnalerta.click();
    }

    public void validarMensaje(String mensaje) {
        wait.until(ExpectedConditions.visibilityOf(lblmensaje));
        String msj = lblmensaje.getText();
        Assert.assertEquals(mensaje,msj);
    }

    public void escribirTexto(String texto) {
        wait.until((ExpectedConditions.visibilityOf(txtbuscador)));
        txtbuscador.sendKeys(texto);
    }

    public void clickBuscar() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(btnbuscar));
        Thread.sleep(5000);
        btnbuscar.click();
    }

    public void clickLink() {
        wait.until(ExpectedConditions.elementToBeClickable(lnkbusqueda));
        lnkbusqueda.click();
    }

    public void validarTitulo() {
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertTrue(lblTitulo.isDisplayed());
    }
}