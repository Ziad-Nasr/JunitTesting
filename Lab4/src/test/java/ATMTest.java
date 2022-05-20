import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM Machine;
    @BeforeEach
    void Before(){
        Machine = new ATM();
    }
    @Nested
    @DisplayName("Operation Tests")
    class Operation{
        @BeforeEach
        public void BeforeNested1(){
            Machine.setMoney(800);
        }
        @Test
        @DisplayName("Case 1")
        public void Test1(){
            assertEquals(300,Machine.Operation(2,500));
        }
        @Test
        @DisplayName("Case 2")
        public void Test2(){
            assertEquals(900,Machine.Operation(1,100));
        }
        @Test
        @DisplayName("Case 3")
        public void Test3(){
            assertEquals(-1,Machine.Operation(15,0));
        }
        @Test
        @DisplayName("Case NULL")
        public void Test4(){
            Machine.setMoney(0);
            assertEquals(-1,Machine.Operation(2,1000));
        }
    }
    @AfterEach
    void After() {
        Machine = null;
    }
}