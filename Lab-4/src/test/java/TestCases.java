import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeEach
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        WebTest webForm = new WebTest(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.enterJobTitle();
        webForm.SelectEducation();
        webForm.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
    }

    @AfterEach
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}