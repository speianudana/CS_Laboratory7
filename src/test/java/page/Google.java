package page;

import base.Base;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Google extends Base {


    public Google() {
        driver.get("https://www.google.com");
    }

    public void writeInSearchBar(String string) {
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys(string);
        searchBar.sendKeys(Keys.ENTER);
    }

    public boolean isContainingGoogle() { return driver.getTitle().contains("Google"); }

}
