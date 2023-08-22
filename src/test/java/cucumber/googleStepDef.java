package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        String str = driver.getCurrentUrl();
        assert str == "https://www.google.com/search?q=Luna+Himemori&sca_esv=558984878&source=hp&ei=MEjkZJbIDpmUwbkPr_WNsAo&iflsig=AD69kcEAAAAAZORWQE06RVE-sMyAEpeYSCVMt3iVy-T2&ved=0ahUKEwiWoIj0xO-AAxUZSjABHa96A6YQ4dUDCAs&uact=5&oq=Luna+Himemori&gs_lp=Egdnd3Mtd2l6Ig1MdW5hIEhpbWVtb3JpSCFQAFgfcAB4AJABAJgBAKABAKoBALgBA8gBAPgBAQ&sclient=gws-wiz";
    }
}
