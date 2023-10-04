package DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        System.out.println("Verify Login");
        Assert.assertFalse(true);
    }
    @Test (dependsOnGroups = {"smoke"}, alwaysRun = true)  //always run parameter
    public void homePage(){
        System.out.println("Home Page");
    }
    @Test
    public void sendRequest(){
        System.out.println("Send Request");
    }
    @Test(groups = {"Smoke"})
    public void viewProfile(){
        System.out.println("View Profile");
    }
    @Test (description = "Successfully logout your account")  // description on test case
    public void logout(){
        System.out.println("Logout");
    }
}
