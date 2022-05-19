import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CoffeMachineTest {
    CoffeMachine Machine;
    @BeforeEach
    void Before(){
        Machine = new CoffeMachine();
    }
    @Nested
    @DisplayName("Insert Cup Integration test")
    class InsertCup{
        @BeforeEach
        public void BeforeNested1(){
            Machine.setCoinsCount(2);
        }
        @Test
        @DisplayName("Case 1")
        public void Test1(){
            assertEquals("Serving Latte",Machine.InputCoff(2));
        }
        @Test
        @DisplayName("Case 2")
        public void Test2(){
            assertEquals("Serving Espresso",Machine.InputCoff(1));
        }
        @Test
        @DisplayName("Case 3")
        public void Test3(){
            assertEquals("Serving Cappuccino",Machine.InputCoff(3));
        }
        @Test
        @DisplayName("Case NULL")
        public void Test4(){
            Machine.InputCoff(1);
            assertEquals("Serving null",Machine.InputCoff(5));
        }
    }
    @AfterEach
    void After() {
        Machine = null;
    }
}