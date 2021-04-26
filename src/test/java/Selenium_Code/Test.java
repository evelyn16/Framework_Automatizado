package Selenium_Code;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("el usuario se encuntre en la pagina de inicio")
    public void el_usuario_se_encuntre_en_la_pagina_de_inicio() {
       String tituloPagina="Your Store";
        Assert.assertEquals(tituloPagina,driver.getTitle());
    }

    @When("ingresa usuario Ok")
    public void ingresa_usuario_Ok() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("ingresa contrasena OK")
    public void ingresa_contrasena_OK() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("se muestra un  mensaje de exito")
    public void se_muestra_un_mensaje_de_exito() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
