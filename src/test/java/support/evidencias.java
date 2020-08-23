package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import test.hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class evidencias {

    public static void screenshot() throws IOException {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmss");
        String ruta = "target/screenshot/"+formato.format(fecha)+"_captura.jpg";
        File file = ((TakesScreenshot) hooks.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(ruta));
    }
}