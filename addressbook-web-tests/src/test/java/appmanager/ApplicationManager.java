package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    ChromeDriver wd;

    private SessionHelper SessionHelper;
    private NavigationsHelper navigationsHelper;
    private  GroupHelper groupHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost:8080/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationsHelper = new NavigationsHelper(wd);
        SessionHelper = new SessionHelper(wd);
        SessionHelper.login("admin", "secret");
    }



    public void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        wd.quit();
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationsHelper getNavigationsHelper() {
        return navigationsHelper;
    }
}
