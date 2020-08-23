package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hooks {
    public static WebDriver driver;
    protected static String navegador = "chrome";

    @BeforeClass
    public static void setUp() {
        if(navegador.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (navegador.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","src\\test\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
