package pe.edu.upc.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

    //static WebDriver webDriver;
    public static void main(String[] args) {

        // Variables
        String urlPage = "http://localhost:8081/onewebs/login";
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
            // Login: Sign in
            System.out.println("Ingreso U");
            webDriver.findElement(By.id("inputUsername")).sendKeys("police1");
            System.out.println("Ingreso P");
            webDriver.findElement(By.id("inputPassword")).sendKeys("police");
            webDriver.findElement(By.xpath("/html/body/div/form/button")).click();

            /*WebElement linkPolice = webDriver.findElement(By.id("link-police"));
            WebElement linkDetainee = webDriver.findElement(By.name("link-detainee"));
            WebElement linkMulct = webDriver.findElement(By.xpath("//body//header//nav//div//ul//li[3]//a"));

            linkMulct.click();

            //WebElement btnNuevoMulct = webDriver.findElement(By.id("btn-nuevo-mulct"));
            //btnNuevoMulct.click();

            webDriver.get("http://localhost:8081/onewebs/mulcts/new");

            // Select Detenido
           Select sltDetainee = new Select( webDriver.findElement(By.id("detenido") ));
            // Agregando datos al formulario
            sltDetainee.selectByValue("8");
            webDriver.findElement(By.id("fechaDetencion")).sendKeys("20/08/2003");
            webDriver.findElement(By.id("direccion")).sendKeys("Av. Ricardo Palma");
            new Select(webDriver.findElement(By.id("infraccion"))).selectByIndex(1);
            webDriver.findElement(By.id("monto")).clear();
            webDriver.findElement(By.id("monto")).sendKeys("250");

            //webDriver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/button")).click();
            webDriver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/button")).submit();*/


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
