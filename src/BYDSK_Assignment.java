import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BYDSK_Assignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Rakesh_Automation\\BeyondSK_Assignment\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String URL = "https://d2ctrust.com/";

        //Maximize chrome window
        driver.manage().window().maximize();

        //Opening the URL
        driver.get(URL);
        Thread.sleep(5000);

        //Scroll down to the Bottom
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'Back to top')]"));
        Thread.sleep(5000);

        jse.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);

        //Locate Back to top button
        WebElement Bottom_Element = driver.findElement(By.xpath("//a[contains(text(),'Back to top')]"));
        Thread.sleep(2000);

        //Highlighting Back to Top Element
        jse.executeScript("arguments[0].setAttribute('style', 'background : orange;');",Bottom_Element);
        Thread.sleep(1500);

        //Click on Back to Top Element
        Bottom_Element.click();
        Thread.sleep(3000);

        //Click on Scale now button
        WebElement Scale_Now = driver.findElement(By.xpath("//button[text()='  Scale now']"));
        Thread.sleep(2000);
        jse.executeScript("arguments[0].setAttribute('style', 'background : orange;');",Scale_Now);
        Thread.sleep(1500);
        Scale_Now.click();
        Thread.sleep(3000);

        //Closing all the windows
        driver.quit();








    }
}
