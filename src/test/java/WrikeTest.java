import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Title;
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
    @Title("Test case scenario")
    public void firstTest(){

        //Arrange
        driver.get("https://www.wrike.com");
        //Act
        new MainPageSteps(driver).clickGetStartedForFreeButton()
        .fillInTheEmailField(Tools.randomWord(6)+"+wpt@wriketask.qaa")
        .clickButtonForCreateAccount().checkLoadPage()
        .checkQAndASectionValidateAnswers()
        .clickButtonForSendRespAndCheckAssertion()
        //assert
        .checkButtonTwitter();

    }

    @After
    public void finish(){
        driver.close();
    }

}
