package Pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaseSteps {

    HomePage homePage;
    private String texte;

    public BaseSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }
    @Step
    public void prepare() {
        BaseTest.prepareDriver();
    }

    @Step
    public void geoLinkEnabled() {
        System.out.println("GeoLink доступно");
        assertTrue("Geo не доступно",
                homePage.isGeoLinkEnabled());
    }

    @Step("Нажимается кнопка город")
    public void clickGeoLink() {
        homePage.clickGeoLink();
    }

    @Step("Поле город должна быть доступна")
    public void GeoFieldDisplayed() {
        assertTrue("GeoFieldDisplayed не доступна",
                homePage.isGeoFieldDisplayed());
    }

    @Step("Очищаем поле города")
    public void clearGeoField() {
        homePage.geoFieldClear();
    }

    @Step("Вводятся Лондон")
    public void printText(String text) {
        homePage.printText(text);
    }
    @Step("Вводятся Париж")
    public void printText2(String text2) {
        homePage.printText2(text2);
    }
    @Step("Click")
    public void click() {
        homePage.clickLink();
    }
    @Step("ClickParis")
    public void clickParis() {
        homePage.clickLinkParis();
    }
    @Step("ClickYet")
    public void clickYet() {
        homePage.clickYetLink();
    }
    @Step("GetText1")
    public void getText1() {
        homePage.yetText1();
    }

    @Step("GetText2")
    public void getText2() {
        homePage.yetText2();
    }
    @Step("Проверка на Трамп")
    public void Equals() {
        assertEquals(homePage.yetText1(), homePage.yetText2());
        System.out.println("Верно");
    }

    @Step("Проверка на Трамп")
    public void containsText() {
        assertTrue(homePage.getTextGeoLink().contains("Лондон"));
        System.out.println("Лондон");
    }
    @Step("Проверка на Париж")
    public void containsText2() {
        assertTrue(homePage.getTextGeoLink2().contains("Париж"));
        System.out.println("Париж");
    }

    @Step
    public void open() {
        BaseTest.getDriver().get("https://yandex.by/");
    }


}

