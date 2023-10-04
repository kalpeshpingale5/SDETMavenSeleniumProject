package Parameter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelFile {
    public static WebDriver driver;
    @DataProvider(name ="data")
    public Object[][] dataProviderFunction() throws IOException {
        Object[][] arrayObject = getExcelData("C:\\Users\\vivek\\OneDrive\\Desktop\\kalpesh.xlsx","Test1");
        return arrayObject;
    }
    public String[][] getExcelData(String filepath, String sheetname) throws IOException {
        String [][] data = null;
        FileInputStream fileInputStream = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetname);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumn =row.getLastCellNum();
        Cell cell;
        data = new String[noOfRows-1][noOfColumn];
        for(int i=1; i<noOfRows; i++){
            for(int j=0; j<noOfColumn; j++){
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

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
    @Test(dataProvider = "data")
    public void verifyGoogle(String courseName, String cityName) throws InterruptedException {

        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys(courseName + cityName);
        nameElement.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.close();
    }
}
