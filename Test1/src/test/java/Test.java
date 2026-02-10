import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Test {
@org.testng.annotations.Test
public void test(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    WebElement txtbox1= driver.findElement(By.id("my-text-id"));
    txtbox1.sendKeys("rahma");
    WebElement txtbox2= driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input"));
    txtbox2.sendKeys("rahmayahia");
    WebElement txtarea=driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[3]/textarea"));
    txtarea.sendKeys("anything");
    WebElement btn=driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button"));
    btn.click();

}

}
