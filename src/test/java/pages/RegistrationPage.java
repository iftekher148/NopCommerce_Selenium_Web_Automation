package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{
    public String registrationUrl = "https://demo.nopcommerce.com/register?returnurl=%2F";
    public String successRegisterUrl = "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
    public By gender_male =  By.id("gender-male");
    public By getGender_female = By.id("gender-female");
    public By first_Name = By.xpath("//input[@id='FirstName']");
    public By last_Name = By.xpath("//input[@id='LastName']");

    public By DateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    public By DateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    public By DateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    public By company_Name  = By.xpath("//input[@id='Company']");
    public By email_button = By.xpath("//input[@id='Email']");
    public By password = By.xpath("//input[@id='Password']");
    public By confirm_Password = By.xpath("//input[@id='ConfirmPassword']");
    public By registration_Button = By.xpath("//button[@id='register-button']");

    public By registration_confirm_msg = By.xpath("//div[@class='result']");
    public String registration_confirm_text = "Your registration completed";

    public void userRegistration(){
        clickOnElement(gender_male);
        writeOnElement(first_Name,"Rahim");
        writeOnElement(last_Name,"Sheik");
        selectWithVisibleText(DateOfBirthDay,"4");
        selectWithVisibleText(DateOfBirthMonth,"April");
        selectWithVisibleText(DateOfBirthYear,"2010");
        writeOnElement(email_button,"abc@gmail.com");
        writeOnElement(password,"12345678");
        writeOnElement(confirm_Password,"12345678");
        clickOnElement(registration_Button);
    }

}
