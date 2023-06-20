package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class utils {

    static WebDriver driver = new ChromeDriver();



    //Reusable variables
    static String searchBar = "gLFyf";


    public static void navigateGoogle(){
        driver.get("https://google.com");
    }

    public static String searchGoogle(String input){
        driver.findElement(By.className(searchBar)).sendKeys(input + Keys.ENTER);
        //WebElement element = driver.findElement(By.xpath("//input[@value='" + input + "']"));
        Assert.assertEquals(driver.findElement(By.xpath("//textarea[@value='" + input + "' and @name='q' and @aria-label= 'Search']")).isDisplayed(), true);
        return input;
    }

    public static void maximizeCurr(){
        driver.manage().window().maximize();
    }

    //Added implicit wait since the button was appearing too fast for driver to capture. Will replace with explicit wait in future
    public static String tapButton (String button){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//input[@class='" + button + "']")).click();
        return button;
    }

    public static String typeSearchBar(String input){
        driver.findElement(By.className(searchBar)).sendKeys(input);
        return input;
    }
    public static void validateSearch(){


    }
}
