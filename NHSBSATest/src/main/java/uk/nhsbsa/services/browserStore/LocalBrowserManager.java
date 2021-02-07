package uk.nhsbsa.services.browserStore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import uk.nhsbsa.services.fileUtil.Props;

public class LocalBrowserManager {

    private WebDriver driver;

    public WebDriver createLocalBrowser() {
        String browserName = Props.getValue("browser.name").toLowerCase();
        if (browserName.contains("chrome")) {
            createChromeBrowser();
        } else if (browserName.contains("firefox")) {
            createFirefoxBrowser();
        } else {
            System.out.println("There is no such browse");
        }
        return driver;
    }

    private void createChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--enable-javascripts");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }

    private void createFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--enable-javascripts");
        options.addArguments("--marionette");
        driver = new FirefoxDriver(options);
    }
}
