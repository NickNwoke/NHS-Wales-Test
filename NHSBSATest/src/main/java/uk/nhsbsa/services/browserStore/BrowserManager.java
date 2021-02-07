package uk.nhsbsa.services.browserStore;

import org.openqa.selenium.WebDriver;
import uk.nhsbsa.services.fileUtil.Props;

public class BrowserManager {

    private static WebDriver driver;

    public WebDriver generateDriver(){
        String placeOfExecution = Props.getValue("placeOfExec");
        if(placeOfExecution.contains("local")){
            LocalBrowserManager lmb = new LocalBrowserManager();
            driver= lmb.createLocalBrowser();
        }else if(placeOfExecution.contains("browserSack")){
            BrowserStackManager bsm = new BrowserStackManager();
            driver = bsm.createRemoterBrowser();
        }
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public void killBrowser(){
        if(driver !=null){
            driver.quit();
            driver=null;
        }
    }

    }

