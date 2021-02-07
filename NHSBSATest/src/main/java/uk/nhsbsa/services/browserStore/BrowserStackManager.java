package uk.nhsbsa.services.browserStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import uk.nhsbsa.services.fileUtil.Props;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackManager {

    public static final String USERNAME = Props.getValue("browstack.username");
    public static final String AUTOMATE_KEY = Props.getValue("browserstack.key");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    public WebDriver createRemoterBrowser() {

        DesiredCapabilities caps = this.decideBrowser();

        caps.setCapability("browser", Props.getValue("browserstack.browser"));
        caps.setCapability("browser_version", Props.getValue("browserstack.browser_version"));
        caps.setCapability("os", Props.getValue("browserstack.os"));
        caps.setCapability("os_version", Props.getValue("browserstack.os_version"));
        caps.setCapability("resolution", Props.getValue("browserstack.resolution"));

        caps.setCapability("build", "Build100");
        caps.setCapability("project", "MagentAutomatedTest");

        caps.setCapability("browserstack.debug", true);
        caps.setCapability("browserstack.networkLogs", "true");
        caps.setCapability("browserstack.console", "warnings");
        caps.setCapability("browserstack.video", "true");


        java.net.URL uri = null;
        try {
            uri = new URL(URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        WebDriver driver = new RemoteWebDriver(uri, caps);
        return driver;
    }

    private DesiredCapabilities decideBrowser() {
        DesiredCapabilities caps = new DesiredCapabilities();
        String browser = Props.getValue("browserstack.browser").toLowerCase();
        return this.selectBrowser(caps, browser);
    }

    private DesiredCapabilities selectBrowser(DesiredCapabilities caps, String browser) {
        if (browser.contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-plugins");
            options.addArguments("--headless");
            options.addArguments("--incognito");
            options.addArguments("--enable-javascript");
            options.addArguments("--disable-websecurity");
            caps.setCapability(ChromeOptions.CAPABILITY, options);
        } else if (browser.contains("firefox")) {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("plugin.state.flash", 0);
            caps.setCapability(FirefoxDriver.PROFILE, profile);
        } else if (browser.contains("ie") || browser.contains("internet")) {
            caps.setCapability("browserstack.ie.noFlash", "true");
        } else if (browser.contains("edge") || browser.contains("microsoft")) {
            //
        } else if (browser.contains("safari")) {
            caps.setCapability("browserstack.safari.enablePopups", "true");
        }
        return caps;
    }


}

