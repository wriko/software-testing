package ru.stqa.softwaretesting.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreations();
        fillGroupForm(new GroupData("111", "test2", "test2"));
        submitGroupCreations();
        returnToGroupPage();
        logout();
    }


}
