package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String logInPageTitle = "nopCommerce demo store";

    public String loginURL ="https://demo.nopcommerce.com/login?returnUrl=%2F";
    public String successLoginUrl = "https://demo.nopcommerce.com/";

    public By loginEmail = By.xpath("//input[@id='Email']");
    public By loginPassword = By.xpath("//input[@id='Password']");
    public By login_button = By.xpath("//button[normalize-space()='Log in']");

    public void userLogin(){
        writeOnElement(loginEmail,"abc@gmail.com");
        writeOnElement(loginPassword,"12345678");
        clickOnElement(login_button);
    }
}
