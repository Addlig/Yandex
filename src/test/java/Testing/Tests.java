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
        homeSteps.click();
        homeSteps.geoLinkEnabled();
        homeSteps.containsText();
        homeSteps.clickYet();
        homeSteps.getText1();
        homeSteps.geoLinkEnabled();
        homeSteps.clickGeoLink();
        homeSteps.GeoFieldDisplayed();
        homeSteps.clearGeoField();
        homeSteps.printText2("Париж");
        homeSteps.clickParis();
        homeSteps.geoLinkEnabled();
        homeSteps.containsText2();
        homeSteps.clickYet();
        homeSteps.getText2();
        homeSteps.Equals();

    }

}
