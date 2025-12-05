package sampler.datapresentation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class datapresentationtests {

    private WebDriver driver;
    private datapresentationpage mainPage;
    private gridpage gridPage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainPage = new datapresentationpage(driver);
        gridPage = new gridpage(driver);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

    @Test
    public void openGridComponent() {

        // ir directamente para o componente grid
        driver.get(mainPage.gridURL);

        // verificar se o grid existe na página
        assertTrue(gridPage.gridComponent.isDisplayed());
    }
}
