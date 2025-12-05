package sampler.interaction;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test di accettazione per il Test Suite 5:
 * "Sampler – componente Interaction".
 * Usa Selenide + Page Object (classe Pages),
 * come richiesto dalla Ficha 5.
 */
public class Tests {

    private Pages pages;

    @BeforeAll
    static void setUpAll() {
        // Configurazione base di Selenide
        Configuration.browser = "chrome";
        // Se vuoi vedere il browser dopo il test, puoi attivare:
        // Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    void setUp() {
        // Prima di ogni test creiamo una nuova istanza della Page Object
        pages = new Pages();
    }

    @Test
    @DisplayName("TS5 – L'utente riesce ad accedere al componente Interaction nel Sampler")
    void shouldAccessInteractionComponent() {
        // 1. Apri la pagina Sampler
        pages.openSamplerHomePage();

        // 2. Naviga fino alla sezione "Interaction"
        pages.navigateToInteractionSection();

        // 3. Verifica che il componente Interaction sia visibile
        boolean visible = pages.isInteractionComponentVisible();

        assertTrue(
                visible,
                "Il componente di tipo Interaction dovrebbe essere visibile dopo la navigazione."
        );
    }
}
