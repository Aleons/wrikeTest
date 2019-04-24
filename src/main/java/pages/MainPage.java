package pages;

import org.openqa.selenium.WebDriver;
import widget.Button;
import widget.Edit;

import static utils.Locators.MainPage.*;

public class MainPage {

    private Button startedFreeButton;
    private Edit emailEdit;
    private Button createButton;

    public MainPage(WebDriver driver) {
        startedFreeButton = new Button(startedFree,driver);
        emailEdit = new Edit(email,driver);
        createButton = new Button(btnCreate, driver);
    }

    public void clickStartedFreeButton(){
        startedFreeButton.click();
    }

    public void inputEmailEdit(String mail){
        emailEdit.inputText(mail);
    }

    public void clickCreateButton(){
        createButton.click();
    }

}
