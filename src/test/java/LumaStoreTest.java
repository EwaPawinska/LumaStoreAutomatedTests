import com.codeborne.selenide.Condition;
import org.junit.Test;

public class LumaStoreTest extends TestBase {

    private final HomePage homePage = new HomePage();

    @Test
    public void homePageShouldBeDisplayed() {
        homePage.getLogoImage().shouldBe(Condition.visible);
    }
}
