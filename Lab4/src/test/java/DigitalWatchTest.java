import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {
    class ATMTest {
        DigitalWatch Watch;
        @BeforeEach
        void Before(){
            Watch = new DigitalWatch();
        }
        @Nested
        @DisplayName("Alarm Tests")
        class Operation{
            @BeforeEach
            public void BeforeNested1(){
                Watch.setTime("02:02:02");
                Watch.setDate("18/5/2022");
            }
            @Test
            @DisplayName("Case 1")
            public void Test1(){
                Watch.AdjustAlarm(true,"02:02:02");
                assertEquals("Ring",Watch.Alarm());
            }
            @Test
            @DisplayName("Case 2")
            public void Test2(){
                Watch.AdjustAlarm(true,"02:04:02");
                assertEquals(null,Watch.Alarm());
            }
            @Test
            @DisplayName("Case 3")
            public void Test3(){
                assertEquals("Alarm is Off",Watch.Alarm());
            }
            @Test
            @DisplayName("Case NULL")
            public void Test4(){
                assertEquals("false input",Watch.AdjustAlarm(false,"00:54:879"));
            }
        }
        @AfterEach
        void After() {
            Watch = null;
        }
    }
}