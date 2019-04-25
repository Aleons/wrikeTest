package steps;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {

    private WebDriver driver;
    private MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        mainPage = new MainPage(driver);
    }

    @Step("Click \"Get started for free\" button near \"Login\" button")
    public MainPageSteps clickGetStartedForFreeButton(){
        mainPage.clickStartedFreeButton();
        return this;
    }

    @Step("Fill in the email field with random generated value of email with mask “<random_text>+wpt@wriketask.qaa” (e.g. “abcdef+wpt@wriketask.qaa”)")
    public MainPageSteps fillInTheEmailField(String email){
        mainPage.inputEmailEdit(email);
        return this;
    }

    @Step("Click on \"Create my Wrike account\" button")
    public ResendPageSteps clickButtonForCreateAccount(){
        mainPage.clickCreateButton();
        return new ResendPageSteps(driver);
    }

}
