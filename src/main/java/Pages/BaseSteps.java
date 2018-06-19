package Pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class BaseSteps {

    HomePage homePage;


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

    @Step("Поле город должна быть доступна")
    public void linkTitleParisDisplayed() {
        assertTrue("GeoFieldDisplayed не доступна",
                homePage.isLinkTitleParisDisplayed());
    }

    @Step("Поле город должна быть доступна")
    public void linkTitleLondonDisplayed() {
        assertTrue("GeoFieldDisplayed не доступна",
                homePage.isLinkTitleLondonDisplayed());
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
    public String getText1() {
       return homePage.yetText1();
    }

    @Step("GetText2")
    public String getText2() {
        return homePage.yetText2();
    }

    @Step("Проверка на Трамп")
    public void Equals(String expected, String actual) {
            assertEquals("неавава ", expected, actual);
            System.out.println("Верно");
    }

    @Step("Проверка на Лондон")
    public void containsText() {
        assertTrue(homePage.getTextGeoLink().contains("Лондон"));
        System.out.println("Содержит Лондон");
    }

    @Step("Проверка на Париж")
    public void containsText2() {
        assertTrue(homePage.getTextGeoLink().contains("Париж"));
        System.out.println("Содержит Париж");
    }

    @Step("Проверка на Лондон")
    public void londonText() {
        assertTrue(homePage.londonText().contains("Лондон"));
        System.out.println("попап Лондон");
    }

    @Step("Проверка на Париж")
    public void parisText() {
        assertTrue(homePage.parisText().contains("Париж"));
        System.out.println("попап Париж");
    }

    @Step
    public void open() {
        BaseTest.getDriver().get("https://yandex.by/");
    }
}