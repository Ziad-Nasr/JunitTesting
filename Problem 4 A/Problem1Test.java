import static org.junit.Assert.*;
import org.junit.Test;
public class Problem1Test {
    @Test
    public void Test1(){
        var watermelon = new Problem1();
        assertEquals("No",watermelon.EvenWatermelon(3));
    }
    @Test
    public void Test2(){
        var watermelon = new Problem1();
        assertEquals("Yes",watermelon.EvenWatermelon(12));
    }
    @Test
    public void Test3(){
        var watermelon = new Problem1();
        assertEquals("invalid",watermelon.EvenWatermelon(-16));
    }
    @Test
    public void Test4(){
        var watermelon = new Problem1();
        assertEquals("Out of range",watermelon.EvenWatermelon(150));
    }
    @Test
    public void Test5() {
        var watermelon = new Problem1();
        assertEquals("Invalid", watermelon.EvenWatermelon(0));
    }
}