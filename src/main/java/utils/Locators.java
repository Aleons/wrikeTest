package utils;

import org.openqa.selenium.By;

public interface Locators {


    public interface MainPage{

        By startedFree = By.xpath("//*[@class=\"r\"]//button");
        By email = By.xpath("//*[@class=\"modal-form-trial__label\"]/input");
        By btnCreate = By.xpath("//*[@class=\"modal-form-trial__label\"]/button");

    }

    public interface ResendPage{

        By interestInWrike = By.xpath("//*[@name=\"survey-form\"]/div[1]//button");
        By membersUsingWrike = By.xpath("//*[@name=\"survey-form\"]/div[2]//button");
        By teamFollow = By.xpath("//*[@name=\"survey-form\"]/div[3]//button");
        By bttResults = By.xpath("//*[@name=\"survey-form\"]/button");
        By resendEmail = By.xpath("//*[@class=\"wg-grid\"]/div/p[3]/button");
        By surveySuccess = By.xpath("//*[@class=\"survey-success\"]");
        By again = By.xpath("(//*[@class=\"again\"])[2]");
        By socialList = By.xpath("//*[@class = \"wg-footer__social-list\"]//li");

    }




}
