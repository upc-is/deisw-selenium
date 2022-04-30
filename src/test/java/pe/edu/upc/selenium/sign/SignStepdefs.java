package pe.edu.upc.selenium.sign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pe.edu.upc.selenium.GenericWebDriver;

public class SignStepdefs {

  public static WebDriver webDriver;

  public SignStepdefs() {
    webDriver = GenericWebDriver.getWebDriver();
  }
  @Given("El Usuario se encuentra en la pagina principal")
  public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
    // Carga la pagina
    webDriver.get("http://localhost:8081/onewebs/");
    // --Maximiza la ventana
    webDriver.manage().window().maximize();
  }

  @And("Hace click en el boton Registrarse")
  public void haceClickEnElBotonRegistrarse() {
    webDriver.findElement(By.linkText("Registrarse")).click();
  }

  @When("El usuario ingresa el login y el password")
  public void elUsuarioIngresaElLoginYElPassword() {
    webDriver.findElement(By.id("username")).sendKeys("manuel");
    webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manuel");
  }

  @And("Hace click en el boton registrar")
  public void haceClickEnElBotonRegistrar() {
    webDriver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[2]/form/button")).click();
  }

  @Then("Ingresa el login y el password")
  public void ingresaElLoginYElPassword() {
    webDriver.findElement(By.id("inputUsername")).sendKeys("manuel");
    webDriver.findElement(By.id("inputPassword")).sendKeys("manuel");
  }

  @And("hace click en Ingresar y le muestra el Dashboard")
  public void haceClickEnIngresarYLePuestraElDashboard() {
    webDriver.findElement(By.xpath("/html/body/div/form/button")).click();
  }
}
