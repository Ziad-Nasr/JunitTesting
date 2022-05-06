import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class WatchTest {
    Watch watch1;
    @BeforeEach
    public void before1() {
        watch1 = new Watch();
    }
    @Nested
    @DisplayName("Normal Transitions")
    class NormalDisplay{
        @Test
        @DisplayName("Normal to Update")
        public void Test1(){
            assertEquals("MIN",watch1.watchOperating('c'));
        }
        @Test
        @DisplayName("Normal to Chime_Alarm")
        public void Test2(){
            assertEquals("ALARM",watch1.watchOperating('b'));
        }
        @Test
        @DisplayName("Normal(Time) to Normal(Date)")
        public void Test3(){
            assertEquals("DATE",watch1.watchOperating('a'));
        }
        @Test
        @DisplayName("Normal(Date) to Normal(Time)")
        public void Test4(){
            watch1.setInsideState("DATE");
            assertEquals("TIME",watch1.watchOperating('a'));
        }
    }
    @Nested
    @DisplayName("Update Transitions")
    class UpdateDisplay {
        @BeforeEach
        public void before2() {
            watch1.setState("UPDATE");
        }

        @Test
        @DisplayName("Update to Normal")
        public void Test1() {
            assertEquals("TIME", watch1.watchOperating('d'));
        }

        @Test
        @DisplayName("min to hour")
        public void Test2() {
            watch1.setInsideState("MIN");
            assertEquals("HOUR", watch1.watchOperating('a'));
        }

        @Test
        @DisplayName("hour to day")
        public void Test3() {
            watch1.setInsideState("HOUR");
            assertEquals("DAY", watch1.watchOperating('a'));
        }

        @Test
        @DisplayName("day to month")
        public void Test4() {
            watch1.setInsideState("DAY");
            assertEquals("MONTH", watch1.watchOperating('a'));
        }

        @Test
        @DisplayName("month to year")
        public void Test5() {
            watch1.setInsideState("MONTH");
            assertEquals("YEAR", watch1.watchOperating('a'));
        }

        @Test
        @DisplayName("min to min")
        public void Test6() {
            watch1.setInsideState("MIN");
            assertEquals("MIN", watch1.watchOperating('b'));
        }
        @Test
        @DisplayName("Hour to Hour")
        public void Test7() {
            watch1.setInsideState("HOUR");
            assertEquals("HOUR", watch1.watchOperating('b'));
        }
        @Test
        @DisplayName("Day to Day")
        public void Test8() {
            watch1.setInsideState("DAY");
            assertEquals("DAY", watch1.watchOperating('b'));
        }
        @Test
        @DisplayName("Month to Month")
        public void Test9() {
            watch1.setInsideState("MONTH");
            assertEquals("MONTH", watch1.watchOperating('b'));
        }
        @Test
        @DisplayName("Year to Year")
        public void Test10() {
            watch1.setInsideState("YEAR");
            assertEquals("YEAR", watch1.watchOperating('b'));
        }
    }
        @Nested
        @DisplayName("Chime_Alarm Transitions")
        class Chime_AlarmDisplay{
        @BeforeEach
        public void before3 (){
            watch1.setState("ALARM");
            watch1.setInsideState("ALARM");
        }
            @Test
            @DisplayName("Chime_Alarm to Normal")
            public void Test1(){
                assertEquals("TIME",watch1.watchOperating('d'));
            }
            @Test
            @DisplayName("Alarm to Chime")
            public void Test2(){
                assertEquals("CHIME",watch1.watchOperating('a'));
            }
        }
    @AfterEach
    public void after1(){
        watch1=null;
    }
}