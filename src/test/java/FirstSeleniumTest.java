import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sabin.Bhattarai\\Desktop\\SeleniumTraining\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.keytorc.com/seleniumTraining/basicHtmlForm.html");

        // Type the username
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("myUsername");

        //Type password
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys(("myPassword"));
        driver.findElement(By.cssSelector("form#HTMLFormElements input[type=\"submit\"]:nth-child(2)")).click();

        // Assertions
        String expectedUsername = "myUsername";
        String expectedPassword= "myPassword";
        Assert.assertEquals(driver.findElement(By.cssSelector("li#_valueusername")).getText(), expectedUsername);
        Assert.assertEquals(driver.findElement(By.cssSelector("li#_valuepassword")).getText(), expectedPassword);
     //   driver.quit();
    }
}
