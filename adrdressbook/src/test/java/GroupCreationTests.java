import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupCreationTests {
  private static WebDriver driver;

  @BeforeEach
  public void setUp() {
    if (driver == null) {
      driver = new ChromeDriver();
      Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
      driver.get("https://addressbook.sintetika.keenetic.pro/index.php");
      driver.manage().window().setSize(new Dimension(1476, 894));
      driver.findElement(By.name("user")).sendKeys("admin");
      driver.findElement(By.name("pass")).sendKeys("secret");
      driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
    }
  }

  @Test
  public void canCreateFirstGroup() {
    if (! isElementPresent(By.name("new"))){
      driver.findElement(By.linkText("groups")).click();
    }
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).sendKeys("1");
    driver.findElement(By.name("group_header")).sendKeys("1");
    driver.findElement(By.name("group_footer")).sendKeys("1");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("group page")).click();
  }

  private boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exception) {
      return false;
    }
  }

  @Test
  public void canCreateSecondGroup() {
    if (! isElementPresent(By.name("new"))){
      driver.findElement(By.linkText("groups")).click();
    }
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).sendKeys("2");
    driver.findElement(By.name("group_header")).sendKeys("2");
    driver.findElement(By.name("group_footer")).sendKeys("2");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("group page")).click();
  }
}
