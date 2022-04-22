import static org.junit.Assert.*;
import org.junit.Test;

public class Problem1FixedTest {
    @Test
    public void Test1(){
        var watermelon = new Problem1Fixed();
        assertEquals("No",watermelon.EvenWatermelon(3));
    }
    @Test
    public void Test2(){
        var watermelon = new Problem1Fixed();
        assertEquals("Yes",watermelon.EvenWatermelon(12));
    }
    @Test
    public void Test3(){
        var watermelon = new Problem1Fixed();
        assertEquals("Invalid",watermelon.EvenWatermelon(-16));
    }
    @Test
    public void Test4(){
        var watermelon = new Problem1Fixed();
        assertEquals("Out of range",watermelon.EvenWatermelon(150));
    }
    @Test
    public void Test5() {
        var watermelon = new Problem1Fixed();
        assertEquals("Invalid", watermelon.EvenWatermelon(0));
    }

}