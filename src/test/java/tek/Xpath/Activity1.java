package tek.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;

public class Activity1 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);


        By locator = By.xpath("//button[@id='addToCartBtn']");
         String text =  driver.findElement(locator).getText();
         System.out.println(text);

         driver.quit();
    }

}

//*[@id="addToCartBtn"]
/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/button