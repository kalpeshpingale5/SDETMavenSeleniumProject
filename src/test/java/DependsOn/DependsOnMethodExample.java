package DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test
    public void verifyLogin(){
        System.out.println("Verify Login");
        Assert.assertFalse(true);
    }
    @Test (dependsOnMethods = {"verifyLogin"})
    public void homePage(){
        System.out.println("Home Page");
    }
    @Test
    public void sendRequest(){
        System.out.println("Send Request");
    }
    @Test
    public void viewProfile(){
        System.out.println("View Profile");
    }
    @Test (dependsOnMethods = {"verifyLogin"})
    public void logout(){
        System.out.println("Logout");
    }
}
