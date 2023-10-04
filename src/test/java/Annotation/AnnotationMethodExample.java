package Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationMethodExample {
    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test(groups = {"Smoke"})
    public void testCase1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase2() {
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void testCase3() {
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
