package tests;

import org.testng.annotations.Test;
import model.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationsHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreations();
        app.getGroupHelper().fillGroupForm(new GroupData("111", "test2", "test2"));
        app.getGroupHelper().submitGroupCreations();
        app.getGroupHelper().returnToGroupPage();
        app.logout();
    }


}
