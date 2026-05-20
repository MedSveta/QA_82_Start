package start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void textBoxXpathTest(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideFooter();
        pause(3000);
        //    li[id='item-2'] css
        //   //li[@id='item-2'] xpath
        //    li[id='item-2'] a[class='']  css
        //   //li[@id='item-2']/a[@class='']   xpath
        //  //input[@placeholder='Full Name'] xpath
        //  input[placeholder='Full Name']    css
        WebElement inputFullName = driver.findElement
                (By.xpath("//input[@placeholder='Full Name']"));
        inputFullName.sendKeys("Monkey");

        driver.quit();
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer')" +
                ".style.display='none'");
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
