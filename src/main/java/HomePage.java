import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePage {

    private final SelenideElement logoImage = $("a.navbar-brand");
}
