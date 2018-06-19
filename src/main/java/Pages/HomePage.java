package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage {

    BaseTest basetest = new BaseTest();
    @FindBy(css = "[class='geolink__reg']")
    private WebElement geoLink;
    @FindBy(css = "input[id=city__front-input]")
    private WebElement geoName;
    @FindBy(css  = "[class='b-autocomplete-item__reg']")
    private WebElement linkTitle;
    @FindBy(xpath  = "//*[@class='b-autocomplete-item__reg'][contains(text(), 'Лондон')]")
    private WebElement linkTitleLondon;
    @FindBy(xpath = "//*[@class='b-autocomplete-item__reg'][contains(text(), 'Париж')]")
    private WebElement linkTitleParis;
    @FindBy(css = "[class='home-tabs__more']")
    private WebElement  yet;
    @FindBy(css = "[data-statlog='tabs.more']")
    private WebElement yetLink;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public boolean isGeoLinkEnabled() {
        System.out.println("isGeoLinkEnabled");
        return geoLink.isEnabled();
    }

    public void clickGeoLink() {
        geoLink.click();
    }

    public void clickYetLink() {
        yetLink.click();
    }
    public boolean isGeoFieldDisplayed() {
        return geoName.isDisplayed();
    }

    /**
     * This lin is present
     * @return
     */
    public boolean isLinkTitleParisDisplayed() {
        return linkTitleParis.isDisplayed();
    }

    public boolean isLinkTitleLondonDisplayed() {
        return linkTitleLondon.isDisplayed();
    }

    public String londonText() {
        return linkTitle.getText();
    }
    public String parisText() {
        return linkTitle.getText();
    }
    public void geoFieldClear() {
        geoName.clear();
    }

    public void printText(String text) {
        geoName.sendKeys(text);
    }

    public String yetText1() {
        return yet.getText();
    }

    public String yetText2() {
        return yet.getText();
    }

    public void clickLink() {
        linkTitle.click();

    }
    public void printText2(String text2) {
        geoName.sendKeys(text2);
    }
    public void clickLinkParis() {
        linkTitleParis.click();
    }
    public String getTextGeoLink() {
        return geoLink.getText();
    }
    public String getTextGeoLink2() {
        return geoLink.getText();
    }
/**
    public void clickFirstLink() {
        firstTitle.click();
    }
**/

}


