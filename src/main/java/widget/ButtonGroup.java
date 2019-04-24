package widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ButtonGroup {

    private List<WebElement> buttonGroup;

    public ButtonGroup(By locator, WebDriver driver) {
        this.buttonGroup = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void clickByIndex(int index){
        buttonGroup.get(index).click();
    }

}
