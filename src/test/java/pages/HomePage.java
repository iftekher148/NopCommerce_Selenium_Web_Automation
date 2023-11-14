package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String homePageUrl ="https://demo.nopcommerce.com/";
    public String homePageTitle = "nopCommerce demo store";
    public By registration_button = By.xpath("//a[normalize-space()='Register']");
    public By login_button = By.xpath("//a[normalize-space()='Log in']");
}
