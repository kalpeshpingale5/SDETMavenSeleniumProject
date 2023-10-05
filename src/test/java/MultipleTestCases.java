import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTestCases {

     @Test
             public void testCase1() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         driver.close();
     }
    @Test
    public void testCase2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.close();
    }
}
