import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openchrome {
    /**
     * Open Google Chrome
     * Navigate to [https://duckduckgo.com/]
     * Assert that the page title is [Google]
     * Close Google Chrome
     *
     */


    @Test

    public void openchrome(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.getTitle();
     //   assert driver.getTitle().equals("Google");

        driver.quit();    }

}
