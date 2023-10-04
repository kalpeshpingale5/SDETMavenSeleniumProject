package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutParameterization {
    @Test
    public void verifyGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys("Java" + "Mumbai");
        nameElement.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.close();
    }
}
