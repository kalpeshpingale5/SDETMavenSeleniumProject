package Priority;

import org.testng.annotations.Test;

public class InVocationCountExample {
    @Test(invocationCount = 10)                                         //No. of execution Test Case
    public void testCase(){

        System.out.println("Test Case 10 times Run");
    }

    @Test(invocationCount = 100, invocationTimeOut = 10)                //No. of execution Test Case within Time
    public void testcase(){

        System.out.println("Test Case 100 & execution time 1 second ");
    }

}
