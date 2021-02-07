package uk.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.nhsbsa.services.fileUtil.Props;


public class BasePage {

    protected   WebDriver driver;

    public  BasePage(WebDriver driver){
        this.driver =driver;
    }

    public NhsCostStartPage prepareBrowser(){
        driver.navigate().to(Props.getValue("baseUrl"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return PageFactory.initElements(driver,NhsCostStartPage.class);
    }
}
