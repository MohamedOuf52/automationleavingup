import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openchrome {
    @Test
    public void openchrome(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
       // driver.navigate("https://www.google.com/ncr");
    }

}
