package manager;

import model.GroupData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    protected static WebDriver driver;

    public void init() {
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

     boolean isElementPresent(By locator) {
      try {
        driver.findElement(locator);
        return true;
      } catch (NoSuchElementException exception) {
        return false;
      }
    }

    public void createGroup(GroupData group) {
      driver.findElement(By.name("new")).click();
      driver.findElement(By.name("group_name")).sendKeys(group.name());
      driver.findElement(By.name("group_header")).sendKeys(group.header());
      driver.findElement(By.name("group_footer")).sendKeys(group.footer());
      driver.findElement(By.name("submit")).click();
      driver.findElement(By.linkText("group page")).click();
    }

    public void openGroupsPage() {
      if (! isElementPresent(By.name("new"))){
        driver.findElement(By.linkText("groups")).click();
      }
    }

    public boolean isGroupPresent() {
      return isElementPresent(By.name("selected[]"));
    }

    public void removeGroup() {
      driver.findElement(By.name("selected[]")).click();
      driver.findElement(By.name("delete")).click();
      driver.findElement(By.linkText("group page")).click();
    }

}
