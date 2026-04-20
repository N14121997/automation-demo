import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void testGoogleTitle() {

        // إعدادات Chrome عشان يشتغل في CI (GitHub Actions)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // تشغيل بدون UI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}