
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FormTest {

    @Test
    void testDangKyVaDangNhap() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://vitimex.com.vn/");

        // click đăng ký
        driver.findElement(By.linkText("Đăng ký")).click();

        driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirm_password")).sendKeys("123456");

        driver.findElement(By.xpath("//button[contains(text(),'Đăng ký')]")).click();

        Thread.sleep(3000);

        // đăng nhập lại
        driver.findElement(By.linkText("Đăng nhập")).click();

        driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
