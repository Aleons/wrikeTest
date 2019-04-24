package widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button {

    private WebElement button;

    public Button(By locator, WebDriver driver) {
        this.button = (new WebDriverWait(driver, 15))
            .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void click(){
        button.click();
    }
}
