package testrunner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.SetUp;

import java.io.IOException;

import static utils.Utils.readJSONData;

public class UserLoginTestrunner extends SetUp {

    @Test(priority = 1, description = "User can login by valid creds")
    public void userLogin() throws IOException, ParseException {
        LoginPage loginPage = new LoginPage(driver);
        JSONArray empArray = readJSONData();
        JSONObject empObj = (JSONObject) empArray.get(empArray.size()-1);

        String username = empObj.get("userName").toString();
        String password = empObj.get("password").toString();
        loginPage.doLogin(username,password);
    }

}
