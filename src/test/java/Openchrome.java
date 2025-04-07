import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenChrome {
    /**
     * Open Google Chrome
     * Navigate to [https://duckduckgo.com/]
     * Assert that the page title is [Google]
     * Close Google Chrome
     *
     */
@BeforeTest
            public void setup() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://duckduckgo.com/");
    driver.manage().window().maximize();

}
    @Test
    public void openchrome() {
        WebDriver driver = new ChromeDriver();

        assert driver.getTitle().equals("DuckDuckGo"); // Corrected expected title

        driver.quit();
    }

    /* Open Google Chrome
    Navigate to [https://duckduckgo.com/]
    Assert that the DuckDuckGo logo is displayed
    Close Google Chrome
*/
    @Test
    public void openchrome2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");

        // Assert that the logo is displayed using a valid Selenium locator
       assert driver.findElement(By.xpath("//section[@class='header_headerLeft__rW6nD header_headerSection___XMRI']//img")).isDisplayed();

        driver.quit();
    }


}
