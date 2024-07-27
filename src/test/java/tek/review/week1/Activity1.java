package tek.review.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {


    /*
    In Retail app, click on sign in then click on Create new Account
    then fill up the form and sign up. Expectation is to Create new Account.
    once account created make sure profile picture is displayed. (isDisplayed)
    And print result of isDisplayed method.
    Push to your repository
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://retail.tekschool-students.com/");

        //Click on SignIn then click
        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

           //Create new Account
       By newAccountLocator = By.id("newAccountBtn");
       WebElement newAccountElement = driver.findElement(newAccountLocator);
       newAccountElement.click();

        //fill up the form
        By nameLocator = By.id("nameInput");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Dalerjon");

        //Random
        String emailPrefix = "Dalerjon_Spartan";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";

           //fill up the form
        By emailLocator = By.id("emailInput");
        WebElement emailElement =  driver.findElement(emailLocator);
        emailElement.sendKeys(randomEmail);

          //fill up the form
        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Alijon03@");

        //fill up the form
        By confirmPassword = By.id("confirmPasswordInput");
        WebElement confirmPasswordElement =  driver.findElement(confirmPassword);
        confirmPasswordElement.sendKeys("Alijon03@");

        By signupLocator = By.id("signupBtn");
        WebElement signupElement =  driver.findElement(signupLocator);
        signupElement.click();

        // profile picture is displayed
        Thread.sleep(3000);
        By profileLocator = By.id("profileImage");
        WebElement profileElement = driver.findElement(profileLocator);
        boolean isProfileDisplayed = profileElement.isDisplayed();
         if (isProfileDisplayed){
             System.out.println("Test Passed");
         } else {
             System.out.println("Test Failed");
         }

        driver.quit();

    }

}
