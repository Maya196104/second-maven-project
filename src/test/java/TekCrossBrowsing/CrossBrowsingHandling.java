package TekCrossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsingHandling {

    public static void main(String[] args) {

        String browserType = "chrome"; // change to Firefox & Edge

        WebDriver driver;

        if (browserType.equals("chrome")) {
              driver = new ChromeDriver();

        } else if (browserType.equals("Firefox")) {

            driver = new FirefoxDriver();

        } else if (browserType.equals("edge")) {

            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Wrong driver");
        }

        driver.get("https://google.com");

        driver.quit();
        }



    }

