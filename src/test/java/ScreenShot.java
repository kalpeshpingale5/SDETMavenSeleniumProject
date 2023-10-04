import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://msrtc.maharashtra.gov.in/");
        driver.manage().window().maximize();

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\vivek\\Downloads\\Screenshot (85)_"+timestamp()+".png");
        FileUtils.copyFile(source,destination);
        driver.close();
    }
    public static String timestamp(){

        return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
    }
}
