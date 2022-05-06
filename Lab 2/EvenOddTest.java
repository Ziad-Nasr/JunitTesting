import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {
    EvenOdd Num;

    @BeforeEach
    public void before() {
        Num = new EvenOdd();
    }

    @Nested
    class EvenTests {
        @Test
        @DisplayName("First Even Test")
        public void Test1() {
            assertEquals("Even", Num.CheckEvenOdd(150));
        }

        @Test
        @DisplayName("Second Even Test")
        public void Test2() {
            assertEquals("Even", Num.CheckEvenOdd(-2));
        }
    }

    @Nested
    class OddTests {
        @Test
        @DisplayName("First Odd Test")
        public void Test1() {
            assertEquals("Odd", Num.CheckEvenOdd(3));
        }

        @Test
        @DisplayName("Second Odd Test")
        public void Test2() {
            assertEquals("Odd", Num.CheckEvenOdd(-9));
        }
    }
    @Nested
    class OtherTests {
        @Test
        @DisplayName("First Random Test")
        public void Test1(){
            assertEquals("Even",Num.CheckEvenOdd(-0));
        }
        @Test
        @DisplayName("Second Random Test")
        public void Test2(){
            assertEquals("Even", Num.CheckEvenOdd(0));
        }
    }
    @AfterEach
    public void after(){
        Num = null;
    }
}