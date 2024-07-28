package tek.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class TagNameLocator {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        //method findElement return List<WebElement> contains all the elements find
        //with By strategy

        By anchorsTagLocator = By.tagName("a");
        List<WebElement> anchorElements =  driver.findElements(anchorsTagLocator);

        System.out.println(anchorElements.size());

        for(WebElement element : anchorElements) {

            System.out.println(element.getText());
        }

        // find how many image is in BBC Home Page.

        By imageTag = By.tagName("img");
        List<WebElement> imagesElements = driver.findElements(imageTag);
        System.out.println(imagesElements.size());

        //Activity Find how many buttons in BBC home page
        // and print the text of each button.

        //By buttonTag = By.tagName("button");
        List<WebElement> buttonElements = driver.findElements(By.tagName("button"));
        System.out.println(buttonElements.size());

         for(WebElement element : buttonElements){
             //not print Empty box
             String text =(element.getText());
             if(!text.isEmpty())
                 System.out.println(text);



         }


     driver.quit();
    }
}
