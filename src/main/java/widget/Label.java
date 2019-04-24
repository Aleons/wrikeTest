package widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Label {

    private WebElement label;

    public Label(By locator, WebDriver driver) {
        this.label = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String getText(){
        return label.getText();
    }

    public boolean waitIsVisible(){
        boolean status = false;
        for(int i = 0; i<5; i++){
            if (label.isDisplayed()==true){
                status = true;
                break;
            }
            else {
                try {
                    Thread.sleep(900);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return status;
    }

}
