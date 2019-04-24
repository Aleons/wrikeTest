package steps;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import pages.ResendPage;

public class ResendPageSteps {

    private ResendPage resendPage;

    public ResendPageSteps(WebDriver driver) {
        resendPage = new ResendPage(driver);
    }

    public ResendPageSteps chooseAnyInterestInWrike(int item){
        resendPage.interestInWrikeButtonGroupSelectAndCLick(item-1);
        return this;
    }

    public ResendPageSteps chooseAnyMembersUsingInWrike(int item){
        resendPage.membersUsingWrikeButtonGroupSelectAndCLick(item-1);
        return this;
    }

    public ResendPageSteps chooseAnyAboutTeamFollowInWrike(int item){
        resendPage.teamFollowButtonGroupSelectAndCLick(item-1);
        return this;
    }

    public ResendPageSteps clickButtonForSendResp(){
        resendPage.resultClick();
        return this;
    }

    public void assertSendResponse(){
        MatcherAssert.assertThat(resendPage.getVisibleStatusSuccessSend(), CoreMatchers.equalTo(true));
    }

}
