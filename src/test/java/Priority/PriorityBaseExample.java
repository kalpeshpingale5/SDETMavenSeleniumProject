package Priority;

import org.testng.annotations.Test;

public class PriorityBaseExample {              //Priority Base Order
    @Test (priority = -10)
    public void testA(){
        System.out.println("Test Case A");       //Priority Order: -ve value, zero(default), +ve value, ascii value
        }
    @Test (priority = 2)
    public void testB(){

        System.out.println("Test Case B"); }
    @Test (priority = 4)
    public void testZ(){

        System.out.println("Test Case Z"); }
    @Test (priority = -1)
    public void testP(){

        System.out.println("Test Case P"); }
    @Test (priority = 3)
    public void testY(){

        System.out.println("Test Case Y"); }
    @Test (priority = 'A')
    public void testC(){

        System.out.println("Test Case C"); }
    @Test
    public void testD(){

        System.out.println("Test Case D"); }
}
