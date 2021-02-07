package uk.nhsbsa.services.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.nhsbsa.services.browserStore.BrowserManager;

public class ScenarioHooks {

    private BrowserManager bf;

    @Before
    public void startTest(){
        this.bf = new BrowserManager();
        bf.generateDriver();

    }
    @After
    public void stopTest(){

        bf.killBrowser();
    }
}
