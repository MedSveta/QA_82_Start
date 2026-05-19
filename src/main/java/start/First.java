package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest() {
        driver.get("https://demoqa.com/");
        pause(3000);
        driver.manage().window().maximize();
        pause(3000);
        driver.navigate().to("https://demoqa.com/elements");
        pause(3000);
        driver.navigate().back();
        pause(3000);
        driver.navigate().refresh();
        pause(3000);
        driver.navigate().forward();
        pause(3000);
        //driver.close();
        driver.quit();
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
