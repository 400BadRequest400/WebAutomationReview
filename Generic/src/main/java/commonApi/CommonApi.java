package commonApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CommonApi {

    public static WebDriver driver = null;
    @Parameters({"platform","url","browser"})

    @BeforeMethod
    public static WebDriver Setup(String platform, String url, String browser){

        System.setProperty("webdriver.chrome.driver","../Generic/src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);
        return  driver;

    }

    @AfterMethod
    public void Quit(){
        driver.quit();
    }



    public void sleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
