import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    @Getter
    private final SelenideElement logoImage = $("a.logo");

}
