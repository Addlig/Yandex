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
    @FindBy(xpath = "//div[4]/div/ul/li[1]/div[1]")
    private WebElement linkTitle;
    @FindBy(css = "[class='home-tabs__more']")
    private WebElement  yet;
    @FindBy(css = "[data-statlog='tabs.more']")
    private WebElement yetLink;
    @FindBy(xpath = "//div[5]/div/ul/li[1]")
    private WebElement linkTitleParis;

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

    public void geoFieldClear() {
        geoName.clear();
    }

    public void printText(String text) {
        geoName.sendKeys(text);
    }

    public String yetText1() {
        System.out.println(yet.getText());
        return yet.getText();
    }

    public String yetText2() {
        System.out.println(yet.getText());
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


