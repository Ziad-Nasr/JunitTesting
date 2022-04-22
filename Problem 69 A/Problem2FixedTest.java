import org.junit.Test;
import static org.junit.Assert.*;

public class Problem2FixedTest {
    @Test
    public void Test1(){
        var Physcists = new Problem2Fixed();
        int[][] Value1 = {{3, -1, 7},{-5, 2 ,-4},{2, -1, -3}};
        assertEquals("YES",Physcists.CheckEquilibrium(Value1,3));
    }
    @Test
    public void Test2(){
        var Physcists2 = new Problem2Fixed();
        int[][] Value2 = {{3, -1, 7},{-5, 2 ,-4},{2, -1, -1000}};
        assertEquals("Out of bounds",Physcists2.CheckEquilibrium(Value2,3));
    }
    @Test
    public void Test3(){
        var Physcists3 = new Problem2Fixed();
        int[][] Value3 = {{3, -1, 7},{-5, 1000 ,-4},{2, -1, -3}};
        assertEquals("Out of bounds",Physcists3.CheckEquilibrium(Value3,3));
    }
    @Test
    public void Test4(){
        var Physcists4 = new Problem2Fixed();
        int[][] Value4 = {{3, -1, 7},{-5, 2 ,-4},{2, -1, -3}};
        assertEquals("Invalid",Physcists4.CheckEquilibrium(Value4,-2));
    }
    @Test
    public void Test5() {
        var Physcists4 = new Problem2Fixed();
        int[][] Value4 = {{3, -1, 7}, {-5, 2, -4}, {2, -1, -3}};
        assertEquals("Invalid", Physcists4.CheckEquilibrium(Value4, 0));
    }
}