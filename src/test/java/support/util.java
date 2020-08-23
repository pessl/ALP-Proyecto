package support;

import org.openqa.selenium.support.ui.WebDriverWait;
import test.hooks;

import java.util.Set;

public class util extends hooks {
    public WebDriverWait wait;

    public util() {
        wait = new WebDriverWait(driver,30);
    }

    public void ingresarUrl(String url) {
        driver.get(url);
    }

    public void iframe(String iframe) {
        driver.switchTo().frame(iframe);
    }

    public void aceptarAlerta() {
        driver.switchTo().alert().accept();
    }

    public void cancelarAlerta() {
        driver.switchTo().alert().dismiss();
    }

    public void obtenerTextoAlerta() {
        String texto = driver.switchTo().alert().getText();
        System.out.print(texto);
    }

    public void nuevaVentana() {
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            driver.switchTo().window(handle);
        }
    }

    public void ventanaInicial() {
        driver.close();
        driver.switchTo().window("");
    }
}