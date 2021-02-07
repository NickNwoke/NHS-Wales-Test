package uk.nhsbsa.services.support;

import org.openqa.selenium.support.PageFactory;
import uk.nhsbsa.services.browserStore.BrowserManager;
import uk.nhsbsa.services.pages.BasePage;

public class WorldHelper {

    private BasePage basePage;

    public BasePage getBasePage(){
        if(basePage !=null)return basePage;
        return PageFactory.initElements(BrowserManager.getDriver(),BasePage.class);
    }
}
