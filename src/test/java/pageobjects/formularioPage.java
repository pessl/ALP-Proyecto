package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class formularioPage extends util {

    @FindBy(id = "RESULT_TextField-1") protected WebElement txtnombre;
    @FindBy(id = "RESULT_TextField-2") protected WebElement txtapellido;
    @FindBy(id = "RESULT_TextField-3") protected WebElement txttelefono;
    @FindBy(id = "RESULT_TextField-4") protected WebElement txtpais;
    @FindBy(id = "RESULT_TextField-5") protected WebElement txtciudad;
    @FindBy(id = "RESULT_TextField-6") protected WebElement txtemail;
    @FindBy(xpath = "//*[text()='Male']") protected WebElement rdbmasculino;
    @FindBy(xpath = "//*[text()='Female']") protected WebElement rdbfemenino;
    @FindBy(id = "RESULT_RadioButton-9") protected WebElement cmbtiempo;
    @FindBy(id = "RESULT_FileUpload-10") protected WebElement txtfile;
    @FindBy(id = "FSsubmit") protected WebElement btnsubmit;

    public formularioPage() {
        PageFactory.initElements(driver,this);
    }

    public void escribirNombre(String nombre) {
        wait.until(ExpectedConditions.visibilityOf(txtnombre));
        txtnombre.sendKeys(nombre);
    }

    public void escribirApellido(String apellido) {
        txtapellido.sendKeys(apellido);
    }

    public void escribirTelefono(String telefono) {
        txttelefono.sendKeys(telefono);
    }

    public void escribirPais(String pais) {
        txtpais.sendKeys(pais);
    }

    public void escribirCiudad(String ciudad) {
        txtciudad.sendKeys(ciudad);
    }

    public void escribirEmail(String email) {
        txtemail.sendKeys(email);
    }

    public void seleccionarGenero(String genero) {
        if(genero.equals("Masculino")) {
            rdbmasculino.click();
        } else if(genero.equals("Femenino")) {
            rdbfemenino.click();
        } else {
            System.out.println("Género enviado incorrectamente");
        }
    }

    public void seleccionarDias(String dias) {
        String [] dia = dias.split("-");
        for(int i = 0; i < dia.length; i++) {
            driver.findElement(By.xpath("//*[text()='"+dia[i]+"']")).click();
        }
    }

    public void seleccionarTiempo(String tiempo) {
        new Select(cmbtiempo).selectByVisibleText(tiempo);
    }

    public void cargarArchivo(String archivo) {
        txtfile.sendKeys(archivo);
    }

    public void clickGuardar() {
        btnsubmit.click();
    }
}