package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxBrowser {

    public static void main(String[] args){

      //Open Firefox Browser
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.manage().window().maximize();

            //Navigate to URL
        chromeDriver.get("https://Firefox.com");

        // return String of Application title.
        String title = chromeDriver.getTitle();
        System.out.println(title);

         // quit to Close browser entirely
        chromeDriver.quit();
    }
}
