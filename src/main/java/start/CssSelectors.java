package start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsCssTest() {
        driver.get("https://demoqa.com/");
        pause(3000);
        driver.manage().window().maximize();
        pause(3000);
        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getTagName());
        WebElement footer1 = driver.findElement(By.cssSelector("footer"));
        System.out.println(footer1.getTagName());
        pause(3000);
        hideFooter();
        //scrollActions();
        //scrollActionsMiddle();
        WebElement divElements = driver.findElement
                (By.cssSelector("div[class='card-body']"));
        divElements.click();
        pause(3000);
        driver.navigate().back();
        pause(3000);
        WebElement divElements1 = driver.findElement
                (By.cssSelector(".card-body"));   //div.card-body
        divElements1.click();
        pause(3000);
        driver.navigate().back();
        pause(3000);
        WebElement divElements2 = driver.findElement
                (By.className("card-body"));
        divElements2.click();
        pause(3000);
        WebElement textBox = driver.findElement(By
                .cssSelector("li[id='item-0']"));
        textBox.click();
        pause(3000);
        driver.navigate().back();
        WebElement textBox1 = driver.findElement(By
                .cssSelector("#item-0"));
        textBox1.click();
        pause(5000);
        driver.navigate().back();
        WebElement textBox2 = driver.findElement(By
                .id("item-0"));
        textBox2.click();
        pause(5000);
        driver.quit();
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer')" +
                ".style.display='none'");
    }

    public void scrollActions(){
        Actions actions = new Actions(driver);
        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0, 0).perform();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void scrollActionsMiddle(){
        long totalHeight = (Long) ((JavascriptExecutor) driver).
                executeScript("return document.body.scrollHeight");
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, (int) totalHeight / 2).perform();
        }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
