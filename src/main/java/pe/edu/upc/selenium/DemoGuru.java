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

        String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_94.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);

        webDriver = new ChromeDriver();
        webDriver.get(urlPage);

        String titulo = webDriver.getTitle();
        System.out.println(titulo);

        // Ejemplo 1
        /*WebElement inputSus;
        WebElement buttonSus;
        for(int i = 0; i < 10; i++) {
            inputSus = webDriver.findElement(By.id("newsletter"));
            inputSus.sendKeys("juan@correo.com");
            buttonSus = webDriver.findElement(By.xpath("//*[@id=\"newsletter-validate-detail\"]/div/div[3]/button"));
            buttonSus.click();
        }*/

        //webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
        //WebElement opcionTV = webDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a"));

        // Ejemplo 2
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

        WebElement inputEmail = webDriver.findElement(By.id("email_address"));
        inputEmail.sendKeys("upcdeisw3@correo.com");

        webDriver.findElement(By.id("password")).sendKeys("123456789");
        webDriver.findElement(By.id("confirmation")).sendKeys("123456789");
        webDriver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();

        webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a")).click();

        webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[1]/a")).click();

        webDriver.findElement(By.id("email")).sendKeys("upcdeisw3@correo.com");
        webDriver.findElement(By.id("pass")).sendKeys("123456789");
        webDriver.findElement(By.id("send2")).click();

        /*inputFirst.clear();
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
        inputLastname.sendKeys("Chirichi");*/


        /*WebElement opcionTV = webDriver.findElement(By.linkText("TV"));
        opcionTV.click();

        WebElement addTV = webDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/button"));
        addTV.click();

        //WebElement addTV2 = webDriver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > button > span > span"));
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
