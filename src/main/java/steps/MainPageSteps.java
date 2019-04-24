package steps;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ResendPage;

public class MainPageSteps {

    private WebDriver driver;
    private MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        mainPage = new MainPage(driver);
    }

    public MainPageSteps ClickGetStartedForFreeButton(){
        mainPage.clickStartedFreeButton();
        return this;
    }

    public MainPageSteps fillInTheEmailField(String email){
        mainPage.inputEmailEdit(email);
        return this;
    }

    public ResendPageSteps clickButtonForCreateAccount(){
        mainPage.clickCreateButton();
        return new ResendPageSteps(driver);
    }

}
