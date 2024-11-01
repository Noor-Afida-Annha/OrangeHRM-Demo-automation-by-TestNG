package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Utils;

import java.io.IOException;
import java.time.Duration;

public class SetUp {
    public WebDriver driver;
    @BeforeTest(groups = "smoke")
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @AfterTest(groups = "smoke")
    public void takeScreenShotWhenFailed(ITestResult result) throws IOException {
     if(ITestResult.FAILURE== result.getStatus()){
         Utils.takeScreenShot(driver);
     }

    }

    //@AfterMethod(group ="smoke")
    public void closeBrowser(){
        driver.quit();
    }
}
