package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

public class googleStepDef {
    private final WebDriver driver = new ChromeDriver();
    static String searchBar = "gLFyf";

    @Given("I am on the Google search page")
    public void I_visit_google() {
        driver.get("https://www.google.com");
    }

    @When("I search for Luna Himemori")
    public void iSearchForLunaHimemori() {
        driver.findElement(By.className(searchBar)).sendKeys("Luna Himemori" + Keys.ENTER);
    }

    @Then("the url should be this")
    public void theUrlShouldBeThis() {
         driver.findElement(By.xpath(("//textarea[@class='gLFyf' and @value ='Luna Himemori']")));
    }

    @Then("the driver should quit")
    public void theDriverShouldQuit() {
        driver.quit();
    }
}
