package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void testCase() throws InterruptedException {
        SoftAssert softAssert =new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement text = driver.findElement(By.id("password"));

        softAssert.assertEquals(driver.getTitle(),"rediffmail","title should be match");
        softAssert.assertTrue(text.isDisplayed());
        softAssert.assertAll();
        Thread.sleep(5000);
        driver.close();
    }
}
