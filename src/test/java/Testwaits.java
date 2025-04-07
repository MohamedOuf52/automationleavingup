import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testwaits {
    @Test
    public void implicityWait() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        // implicity
        // driver.manage().timeouts().implicitlyWait(0, java.util.concurrent.TimeUnit.SECONDS);
        //  driver.findElement(org.openqa.selenium.By.id("adder")).click();
        // Explicit waits

        driver.findElement(org.openqa.selenium.By.id("reveal")).click();

        //.sendKeys("welcom to selnuim");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
        inputElement.sendKeys("welcome to selenium");


        //  driver.findElement(org.openqa.selenium.By.id("reveal")).sendKeys("welcom to selnuim");
        // driver.quit();
    }


}
