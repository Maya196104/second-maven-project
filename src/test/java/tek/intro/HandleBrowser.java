package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {

    public static void main(String[] args){


        //Open Browser Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();
         //Use this method to Maximize the Browsers
         chromeDriver.manage().window().maximize();

        //Navigate to a URL
        chromeDriver.get("https://google.com");

          // return String of Application title.
        String title = chromeDriver.getTitle();
        System.out.println(title);


        // quit to Close browser entirely
         chromeDriver.quit();


    }

}
