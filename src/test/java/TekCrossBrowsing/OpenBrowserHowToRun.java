package TekCrossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class OpenBrowserHowToRun {
    public static void main(String[] args) {




        String BrowserType = "chrome";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose browser chrome, firefox and edge");

        WebDriver driver;

        String browserType = "edge";
        if (browserType.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equals("firefox")) {
             driver = new FirefoxDriver();
        } else if(browserType.equals("edge")) {
              driver = new EdgeDriver();
        } else {

            throw new RuntimeException("Wrong driver");

        }

        driver.get("https://google.com");
        driver.quit();
    }

}
