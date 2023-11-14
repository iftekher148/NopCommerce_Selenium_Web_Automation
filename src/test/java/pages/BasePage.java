package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.ByteArrayInputStream;

import static utilities.DriverSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }
    public void clickOnElement(By locator){
      // getDriver().findElement(locator).click();
        getElement(locator).click();
    }
    public void writeOnElement(By locator,String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }
    public void selectWithVisibleText(By selectLocator,String visibleText){
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }
    public String getElementText(By locator){
        return getElement(locator).getText();
    }
    public boolean isElementVisible(By locator){
        return getElement(locator).isDisplayed();
    }
    public void addScreeShort(String name) {
        Allure.addAttachment(name,new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
