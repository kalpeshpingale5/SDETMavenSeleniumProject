package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BeforeMethodWithParameter {
    public static WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethod(String browserName){
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            throw  new RuntimeException("Please select the correct browser");
        }
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyGoogle(String courseName, String cityName) throws InterruptedException {

        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys(courseName + cityName);
        nameElement.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.close();
    }
}
