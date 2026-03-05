import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitimexTest {
    private WebDriver webDriver;

    @BeforeEach
    void setUp() {
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {
        webDriver.get("https://vitimex.com.vn/");


        webDriver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[3]/div/div[3]")).click();


        webDriver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/h4[2]/a")).click();


        webDriver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Le");


        webDriver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Hung");


        webDriver.findElement(By.xpath("//*[@id=\"radio2\"]")).click();


        webDriver.findElement(By.xpath("//*[@id=\"birthday\"]")).click();


        webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();


        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jj456@gmail.com");


        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("jjl456");

        webDriver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[8]/div[1]/input")).click();

    }
}
