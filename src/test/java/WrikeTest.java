import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.MainPageSteps;
import utils.Tools;

public class WrikeTest {

    private static WebDriver driver;
    private MainPageSteps mainPageSteps;

    @Before
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void firstTest(){

        //Arrange
        driver.get("https://www.wrike.com");
        //Act
        new MainPageSteps(driver).ClickGetStartedForFreeButton()
        .fillInTheEmailField(Tools.randomWord(6)+"+wpt@wriketask.qaa")
        .clickButtonForCreateAccount()
        .chooseAnyInterestInWrike(Tools.randomNumber(1,2))
        .chooseAnyMembersUsingInWrike(Tools.randomNumber(1,5))
        .chooseAnyAboutTeamFollowInWrike(Tools.randomNumber(1,2))
        .clickButtonForSendResp()
        //assert
        .assertSendResponse();

    }

    @After
    public void finish(){
        driver.close();
    }

}
