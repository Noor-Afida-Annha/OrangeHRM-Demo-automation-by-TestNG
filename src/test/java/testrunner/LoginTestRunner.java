package testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import setup.SetUp;

public class LoginTestRunner  extends SetUp {

    LoginPage loginPage;
    @Test(priority = 2,description = "Admin can login with valid creds", groups = "smoke")
    public void  doLogin(){
        loginPage = new LoginPage(driver);
       loginPage.doLogin("Admin","admin123");
        //loginPage.doLogin(System.getProperty("username"),System.getProperty("password"));
        Assert.assertTrue(loginPage.btnProfileImage.isDisplayed());
    }
    @Test(priority = 1,description = "Admin can't login with valid" )
    public void doLoginWrongCreds(){
        loginPage = new LoginPage(driver);
        String loginTitleActual=driver.findElement(By.className("orangehrm-login-title")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginTitleActual.contains("My Login"));
        softAssert.assertTrue(driver.findElement(By.className("orangehrm-login-branding")).isDisplayed());

        loginPage.doLogin("Adminnn","admin14123");
        WebElement alertTextElem=driver.findElement(By.className("oxd-alert-content-text"));
        softAssert.assertEquals(alertTextElem.getText(),"Invalid credentials");

        softAssert.assertAll();
    }

   @Test(priority = 3,description = "Admin can logout by clicking on logout btn", groups = "smoke")
   public void doLogout(){
        loginPage=new LoginPage(driver);
        loginPage.doLogout();
        WebElement forgotPassLinkElem = driver.findElement(By.className("orangehrm-login-forgot-header"));
        Assert.assertTrue(forgotPassLinkElem.isDisplayed());
   }
}
