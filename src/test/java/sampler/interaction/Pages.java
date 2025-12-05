package sampler.interaction;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;

public class Pages {

    private static final String SAMPLER_URL = "https://demo.vaadin.com/sampler/";

    // 1) Link/menu "Interaction" – prendi l'elemento visibile
    private final SelenideElement interactionMenuLink =
            $$(byText("Interaction")).findBy(visible);

    // 2) Radice del componente "Interaction" – di nuovo, elemento visibile
    private final SelenideElement interactionComponentRoot =
            $$(byText("Interaction")).findBy(visible);

    public void openSamplerHomePage() {
        open(SAMPLER_URL);
    }

    public void navigateToInteractionSection() {
        interactionMenuLink.shouldBe(visible).click();
    }

    public boolean isInteractionComponentVisible() {
        interactionComponentRoot.shouldBe(visible);
        return interactionComponentRoot.isDisplayed();
    }
}
