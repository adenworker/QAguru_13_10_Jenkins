package guru.qa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.annotations_steps.AnnotationQAapfSteps;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DemoQAapfTestCase extends TestBase {

    @Test
    @DisplayName("Проверка работы автотеста на странице проверки формы DemoQA")
    @Owner("alisichkin")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Подключение Дженкинса")
    @Story("Работа связки Дженкинс + Гитхаб + Аллюр")
    @Description("Дженкинс на базе autotests.cloud прогоняет автотест с гитхаба")
    @Link(name = "DemoQA", url = "https://demoqa.com/automation-practice-form")
    void QAapf() {
        SelenideLogger.addListener("Allure Listener", new AllureSelenide());
        AnnotationQAapfSteps steps = new AnnotationQAapfSteps();

        steps.apfPageOpening();
        steps.adRemoving();
        steps.setFirstName();
        steps.setLastName();
        steps.setEmail();
        steps.setSex();
        steps.setPhoneNumber();
        steps.setBirthDate();
        steps.setSubject();
        steps.setHobby();
        steps.setAvatar();
        steps.setAddress();
        steps.setState();
        steps.setCity();
        steps.clickSubmit();
        steps.resultChecking();
    }
}
