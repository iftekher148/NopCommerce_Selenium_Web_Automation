package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {

    //Take browser name from console
    private static String browserName = System.getProperty("browser","Chrome");
    private static final ThreadLocal <WebDriver> LOCAL_DRIVER = new ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        DriverSetup.LOCAL_DRIVER.set(driver);
    }
    public static WebDriver getDriver(){
        return LOCAL_DRIVER.get();
    }
    public static WebDriver createDriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        }else{
            throw new RuntimeException("Browser Name is not found:" + browserName);
        }
    }

    @BeforeSuite
        public static synchronized void setBrowser(){
        WebDriver driver = createDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        setDriver(driver);
    }
    @AfterSuite
    public static synchronized void quiteBrowser(){
        getDriver().quit();
    }

}
