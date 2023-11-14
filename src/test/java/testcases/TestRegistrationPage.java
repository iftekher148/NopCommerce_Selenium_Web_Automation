package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilities.DriverSetup;

public class TestRegistrationPage extends DriverSetup {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void testRegistrationPage(){
        getDriver().get(registrationPage.registrationUrl);

        registrationPage.userRegistration();
        registrationPage.addScreeShort("After Successful Registration");

        Assert.assertEquals(getDriver().getCurrentUrl(),registrationPage.successRegisterUrl);
        Assert.assertTrue(registrationPage.isElementVisible(registrationPage.registration_confirm_msg));
        Assert.assertEquals(registrationPage.getElementText(registrationPage.registration_confirm_msg),registrationPage.registration_confirm_text);

    }
}
