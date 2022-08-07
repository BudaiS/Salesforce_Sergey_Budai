package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import pages.TestListener;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)

public class BaseTests {
    protected final static String USERNAME = "budai.s86-suye@force.com";
    protected final static String PASSWORD = "Simple1986";


    protected WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;


    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) throws Exception {
        String browserName = System.getProperty("browser", "chrome");
        driver = DriverFactory.getDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {

        loginPage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void clear() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
        ((JavascriptExecutor) driver).executeScript(String.format("window.sessionStorage.clear();"));

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }

}
