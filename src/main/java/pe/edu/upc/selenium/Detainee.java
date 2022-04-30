package pe.edu.upc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Detainee {
  public static void main(String[] args) {

    String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_100_60.exe";
    System.setProperty("webdriver.chrome.driver", pathDriver);

    String urlPage = "http://localhost:8081/onewebs";
    WebDriver webDriver = new ChromeDriver();
    webDriver.get(urlPage);

    String titulo = webDriver.getTitle();
    System.out.println(titulo);

    webDriver.findElement(By.linkText("Registrarse")).click();
    webDriver.findElement(By.id("username")).sendKeys("manuel");
    webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manuel");
    webDriver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[2]/form/button")).click();

    webDriver.findElement(By.id("inputUsername")).sendKeys("manuel");
    webDriver.findElement(By.id("inputPassword")).sendKeys("manuel");
    webDriver.findElement(By.xpath("/html/body/div/form/button")).click();

  }

}
