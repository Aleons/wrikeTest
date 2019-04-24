package widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edit {

    private WebElement edit;

    public Edit(By locator, WebDriver driver) {
        this.edit = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void inputText(String text){
        edit.sendKeys(text);
    }

}
