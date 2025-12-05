package sampler.datapresentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://demo.vaadin.com/sampler
public class datapresentationpage {


    // Secção do menu "Data presentation"
    public String gridURL = "https://vaadin.com/docs/latest/components/grid";

    public datapresentationpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
