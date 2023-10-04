package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameter {
    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyGoogle(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys(courseName + cityName);
        nameElement.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.close();
    }
}
