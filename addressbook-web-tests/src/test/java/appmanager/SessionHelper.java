package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {
    private ChromeDriver wd;

    public SessionHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public void login(String username, String password) {
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
        wd.findElement(By.xpath("//div[@id='header']/a")).click();
    }
}

