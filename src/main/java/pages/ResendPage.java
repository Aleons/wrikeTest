package pages;

import org.openqa.selenium.WebDriver;
import widget.Button;
import widget.ButtonGroup;
import widget.Label;

import static utils.Locators.ResendPage.*;

public class ResendPage {


    private ButtonGroup interestInWrikeButtonGroup;
    private ButtonGroup membersUsingWrikeButtonGroup;
    private ButtonGroup teamFollowButtonGroup;
    private Button resultsButton;
    private Label success;

    public ResendPage(WebDriver driver) {

        interestInWrikeButtonGroup = new ButtonGroup(interestInWrike,driver);
        membersUsingWrikeButtonGroup = new ButtonGroup(membersUsingWrike,driver);
        teamFollowButtonGroup = new ButtonGroup(teamFollow,driver);
        resultsButton = new Button(bttResults, driver);
        success = new Label(surveySuccess,driver);
    }

    public void interestInWrikeButtonGroupSelectAndCLick(int numberItem){
        interestInWrikeButtonGroup.clickByIndex(numberItem);
    }

    public void membersUsingWrikeButtonGroupSelectAndCLick(int numberItem){
        membersUsingWrikeButtonGroup.clickByIndex(numberItem);
    }

    public void teamFollowButtonGroupSelectAndCLick(int numberItem){
        teamFollowButtonGroup.clickByIndex(numberItem);
    }

    public void resultClick(){
        resultsButton.click();
    }

    public boolean getVisibleStatusSuccessSend(){
        return success.waitIsVisible();
    }

}
