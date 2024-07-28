package tek.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

     /*
    In Retail app go to create new account
    and create new account.
    use name, id, linkText or anything that is available.
    15 Minute.
     */

    public static void main(String[] args) throws InterruptedException {


       WebDriver driver = new ChromeDriver();
       driver.get("https://retail.tekschool-students.com/");
       driver.manage().window().maximize();


        By signInLocator =  By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        //driver.findElement(By.linkText("Sign In")).click();

        driver.findElement(By.linkText("Create New Account")).click();

        driver.findElement(By.name("name")).sendKeys("Mariela");



        driver.findElement(By.name("email")).sendKeys("mariela79@gmail.com");


        driver.findElement(By.name("password")).sendKeys("Flores19@");

        driver.findElement(By.name("confirmPassword")).sendKeys("Flores19@");

        driver.findElement(By.id("signupBtn")).click();

        //getText() method will return the text of an element

        String errorText = driver.findElement(By.className("error")).getText();

        System.out.println(errorText);

        Thread.sleep(3000);

        driver.quit();






    }
}
