package tek.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Tekschool");

        Thread.sleep(1000);

       driver.findElement(By.name("btnK")).click();

       Thread.sleep(2000);
       driver.findElement(By.partialLinkText("TEK SCHOOL Modern")).click();


    }


}
