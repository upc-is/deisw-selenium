package pe.edu.upc.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions {

    static WebDriver webDriver;
    public static void main(String[] args) {

        // Variables
        String urlPage = "https://www.google.com.pe/";
        // Establece el chrome driver
        WebDriver webDriver;
        String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_93.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        webDriver = new ChromeDriver();

        // Carga la pagina
        webDriver.get(urlPage);

        // --Maximiza la ventana
        webDriver.manage().window().maximize();

        try {
            WebElement inpTexto = webDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
            inpTexto.sendKeys("Cucumber");

            webDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();

            String texto = webDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[5]/div/div[2]/div/span")).getText();
            System.out.println(texto);

        } catch ( NoSuchElementException ne) {
            System.err.println("ERROR NE: No hay el elemento que estas buscando\n" + ne.getMessage());
        }
        catch( WebDriverException we) {
            System.err.println("ERROR WE: " + we.getMessage());
        } catch ( Exception e ) {
            System.err.println("ERROR: " + e.getMessage());
        } finally {
            //webDriver.close();
        }

    }
}
