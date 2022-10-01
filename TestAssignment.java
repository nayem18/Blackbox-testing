import static org.junit.Assert.assertEquals;

//import java.beans.Transient;

import org.junit.Test;

public class TestAssignment {
    @Test
    public void testCase(){
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.checkLeapYear(2000);
        assertEquals(true, result);
    }

    @Test
    public void testCase2(){
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.checkLeapYear(2001);
        assertEquals(false, result);
    }
   /*
    @Test
    public void towNumber(){
        Sum sum = new Sum();
        assertEquals(10, sum.add(4,6));
    }
    */
    
    @Test
    public void TestSum(){
        Sum sum = new Sum();
        double result = sum.calculatesum(4.00, 12.00);
        assertEquals(2.40,result,0.5);
    }
    

    @Test
    public void TestPrime1(){
        Prime prime = new Prime();
        boolean result = prime.checkForPrime(7);
        assertEquals(true, result);
    }
}
