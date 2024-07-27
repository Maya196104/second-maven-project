package tek.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkNameAndClassName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        // Using linkText Sign In
        By signInLocalor = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocalor);
        signInElement.click();

         // Using Name find email
        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("wrongEmail@gmail.com");

        // Using Name find password
        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password135");

        // Using ID find login
         By loginBtnLocator = By.id("loginBtn");
         WebElement loginBtnElement = driver.findElement(loginBtnLocator);
         loginBtnElement.click();


         Thread.sleep(1000);

        // Using className find error
         By errorLocator = By.className("error");
         WebElement errorElement = driver.findElement(errorLocator);

         //getText() method will return the text of an element.
         String errorText = errorElement.getText();
         System.out.println(errorText);

         driver.quit();
    }
}
