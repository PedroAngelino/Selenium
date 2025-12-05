package sampler.datapresentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_visible = after clicking "Grid"
public class gridpage {

    @FindBy(css = "vaadin-grid")
    public WebElement gridComponent;

    public gridpage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
