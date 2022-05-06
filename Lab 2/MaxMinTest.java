import org.junit.jupiter.api.*;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {
    MaxMin Num;
    @BeforeEach
    public void before() {
        Num = new MaxMin();
    }

    @Nested
    class Array1Tests {
        @Test
        @DisplayName("First Min Test")
        public void Test1() {
            double[] Array={-10.0,34.0,2.3,3.5,45.8};
            assertEquals(-10.0, Num.FindMinMax("min",Array));
        }

        @Test
        @DisplayName("First Max Test")
        public void Test2() {
            double[] Array={-10.0,34.0,2.3,3.5,45.8};
            assertEquals(45.8, Num.FindMinMax("max",Array));
        }
    }

    @Nested
    class Array2Tests {
        @Test
        @DisplayName("Second Min Test")
        public void Test1() {
            double[] Array={.6,-34.0,25.3,-99.1,99.1};
            assertEquals(-99.1, Num.FindMinMax("min",Array));
        }
        @Test
        @DisplayName("Second Max Test")
        public void Test2() {
            double[] Array={.6,-34.0,25.3,-99.1,99.1};
            assertEquals(99.1, Num.FindMinMax("max",Array));
        }
    }

    @AfterEach
    public void after(){
        Num = null;
    }
}