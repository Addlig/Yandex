package Testing;

import Pages.BaseSteps;
import Pages.BaseTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    BaseSteps homeSteps;

    @AfterClass
    public static void afterClass() {
        BaseTest.closeDriver();
    }

    @Before
    public void before() {

        homeSteps = new BaseSteps(BaseTest.getDriver());
        homeSteps.prepare();
        homeSteps.open();
    }

    @Test
    public void first() {

        homeSteps.geoLinkEnabled();
        homeSteps.clickGeoLink();
        homeSteps.GeoFieldDisplayed();
        homeSteps.clearGeoField();
        homeSteps.printText("Лондон");
        homeSteps.linkTitleLondonDisplayed();
        homeSteps.londonText();
        homeSteps.click();
        homeSteps.geoLinkEnabled();
        homeSteps.containsText();
        homeSteps.clickYet();
        String text1 = homeSteps.getText1();
        homeSteps.geoLinkEnabled();
        homeSteps.clickGeoLink();
        homeSteps.GeoFieldDisplayed();
        homeSteps.clearGeoField();
        homeSteps.printText2("Париж");
        homeSteps.linkTitleParisDisplayed();
        homeSteps.parisText();
        homeSteps.click();
        /**homeSteps.clickParis();**/
        homeSteps.geoLinkEnabled();
        homeSteps.containsText2();
        homeSteps.clickYet();
        String text2 = homeSteps.getText2();
        homeSteps.Equals(text1, text2);

    }

}
