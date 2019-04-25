package steps;

import ru.yandex.qatools.allure.annotations.Step;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import pages.ResendPage;
import utils.Tools;

public class ResendPageSteps {

    private ResendPage resendPage;
    private WebDriver driver;

    public ResendPageSteps(WebDriver driver) {
        resendPage = new ResendPage(driver);
        this.driver = driver;
    }

    @Step("check with assertion that you are moved to the next page")
    public ResendPageSteps checkLoadPage(){
        MatcherAssert.assertThat(driver.getCurrentUrl(), CoreMatchers.containsString("www.wrike.com/resend/"));
        return this;
    }

    @Step("Fill in the Q&A section at the left part of page (like random generated answers) + check with assertion that your answers are submitted")
    public ResendPageSteps checkQAndASectionValidateAnswers(){
        resendPage.interestInWrikeButtonGroupSelectAndCLick(Tools.randomNumber(0,1));
        resendPage.membersUsingWrikeButtonGroupSelectAndCLick(Tools.randomNumber(0,4));
        resendPage.teamFollowButtonGroupSelectAndCLick(Tools.randomNumber(0,1));
        resendPage.resultClick();
        MatcherAssert.assertThat(resendPage.getVisibleStatusSuccessSend(), CoreMatchers.equalTo(true));
        return this;
    }

    @Step("Click on \"Resend email\" + check it with assertion")
    public ResendPageSteps clickButtonForSendRespAndCheckAssertion(){
        resendPage.resendEmailButtonClick();
        MatcherAssert.assertThat(resendPage.getVisibleReSendMailText(), CoreMatchers.equalTo(true));
        return this;
    }

    @Step("Check that section \"Follow us\" at the site footer contains the \"Twitter\" button that leads to the correct url and has the correct icon")
    public ResendPageSteps checkButtonTwitter(){
        MatcherAssert.assertThat(resendPage.getUrlTwitter(), CoreMatchers.equalTo("https://twitter.com/wrike"));
        return this;
    }

}
