package pe.edu.upc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {

    public static void main(String[] args) {
        // Variables
        String urlPage = "http://live.demoguru99.com/";
        // Establece el chrome driver
        WebDriver webDriver;

        String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_93.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);

        webDriver = new ChromeDriver();
        webDriver.get(urlPage);

        String titulo = webDriver.getTitle();
        System.out.println(titulo);

        //webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();

        //WebElement opcionTV = webDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a"));

        WebElement opcionTV = webDriver.findElement(By.linkText("TV"));
        opcionTV.click();

        WebElement addTV = webDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/button"));
        addTV.click();

        WebElement conti = webDriver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tfoot/tr/td/button[4]"));
        conti.click();

        webDriver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        webDriver.findElement(By.linkText("Register")).click();

        WebElement inputFirst = webDriver.findElement(By.id("firstname"));
        inputFirst.sendKeys("Juan ");

        WebElement inputMiddlename = webDriver.findElement(By.id("middlename"));
        inputMiddlename.sendKeys("Antonio");

        WebElement inputLastname = webDriver.findElement(By.id("lastname"));
        inputLastname.sendKeys("Flores");

        inputFirst.clear();
        inputMiddlename.clear();
        inputLastname.clear();
        inputFirst.sendKeys("Carlos");
        inputMiddlename.sendKeys("Pedro");
        inputLastname.sendKeys("Romani");

        inputFirst.clear();
        inputMiddlename.clear();
        inputLastname.clear();
        inputFirst.sendKeys("Jose");
        inputMiddlename.sendKeys("Fernando");
        inputLastname.sendKeys("Romero");

        inputFirst.clear();
        inputMiddlename.clear();
        inputLastname.clear();
        inputFirst.sendKeys("Roberto");
        inputMiddlename.sendKeys("Manuel");
        inputLastname.sendKeys("Chirichi");

        /*
        WebElement addTV2 = webDriver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > button > span > span"));
        addTV2.click();

        WebElement opcionMobile = webDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a"));
        opcionMobile.click();

        WebElement addMobile1 = webDriver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > button > span > span"));
        addMobile1.click();

        WebElement grandTotal = webDriver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span"));
        String total = grandTotal.getText();

        System.out.println("El importe total es: " + total);*/

    }
}
