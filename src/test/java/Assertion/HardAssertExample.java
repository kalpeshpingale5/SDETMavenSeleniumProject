package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class HardAssertExample {
    @Test
    public void testCase() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

       /* WebElement text = driver.findElement(By.id("password"));

        Assert.assertEquals(driver.getTitle(),"Rediffmail","title should be match");
        Assert.assertTrue(text.isDisplayed());
        Thread.sleep(5000);*/
        driver.close();
    }
}
