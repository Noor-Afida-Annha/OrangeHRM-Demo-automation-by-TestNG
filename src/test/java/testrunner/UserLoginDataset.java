package testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.LoginDataset;
import setup.SetUp;

public class UserLoginDataset extends SetUp {
    @Test(dataProvider = "LoginCSVData", dataProviderClass = LoginDataset.class)

    public void userLogin(String username,String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin(username,password);
    }
    @AfterTest
    public void logOut(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogout();
    }
}
