package Priority;

import org.testng.annotations.Test;

public class DefaultPriorityExample {
    @Test
    public void testA(){
        System.out.println("Test Case A");   //Default Alphabetical Order
    }
    @Test
    public void testB(){
        System.out.println("Test Case B");
    } @Test (groups = {"Smoke"})
    public void testZ(){

        System.out.println("Test Case Z");
    }
    @Test
    public void testP(){

        System.out.println("Test Case P");
    }
    @Test
    public void testY(){

        System.out.println("Test Case Y");
    }
}
