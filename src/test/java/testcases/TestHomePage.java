package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    public void testHomePageTitle(){
        getDriver().get(homePage.homePageUrl);
        Assert.assertEquals(getDriver().getTitle(),homePage.homePageTitle);
    }

    @Test
    public void testHomePageUrl(){
        getDriver().get(homePage.homePageUrl);
        Assert.assertEquals(getDriver().getCurrentUrl(),homePage.homePageUrl);
    }

    @Test
    public void testHomePageRegistrationButton(){
        getDriver().get(homePage.homePageUrl);
        Assert.assertTrue(homePage.isElementVisible(homePage.registration_button));
    }
    @Test
    public void testHomePageLoginButton(){
        getDriver().get(homePage.homePageUrl);
        Assert.assertTrue(homePage.isElementVisible(homePage.login_button));
    }

}
