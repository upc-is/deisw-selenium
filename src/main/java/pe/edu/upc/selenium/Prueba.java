package pe.edu.upc.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba {

    public static void main(String[] args) {
        // Variables
        String urlPage = "https://ajaflorez-coder.github.io/";

        WebDriver webDriver;
        String pathDriver = "C:\\Users\\USUARIO\\IdeaProjects\\deisw-selenium\\driver\\chromedriver_93.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);

        webDriver = new ChromeDriver();
        webDriver.get(urlPage);

        String titulo = webDriver.getTitle();
        System.out.println(titulo);

    }

}
