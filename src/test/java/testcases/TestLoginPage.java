package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestLoginPage extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    @Test
    public void testLoginPage(){
        getDriver().get(loginPage.loginURL);

        loginPage.userLogin();
        loginPage.addScreeShort("After Successful Login");

        Assert.assertEquals(getDriver().getCurrentUrl(),loginPage.successLoginUrl);
        Assert.assertEquals(getDriver().getTitle(),loginPage.logInPageTitle);

    }
}
