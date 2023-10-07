import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://msrtc.maharashtra.gov.in/");
       

        driver.close();
    }
}

