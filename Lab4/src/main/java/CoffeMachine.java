public class CoffeMachine {

    boolean CoffBusyState;
    int CoinsCount;
    int CoffCount;

    public CoffeMachine() {
        CoffBusyState = false;
        CoinsCount = 0;
        CoffCount = 0;
    }

    public void setCoinsCount(int coinsCount) {
        CoinsCount = coinsCount;
    }

    public String InputCoff(int CoffeType) {
        if (!CoffBusyState) {
            CoffBusyState = true;
            String Type = CoffeType(CoffeType);
            return MakeCoff(Type);
        }
        return "Wait";
    }
    public String CoffeType(int CoffeType){
        switch(CoffeType){
            case(1): return "Espresso";
            case(2): return "Latte";
            case(3): return "Cappuccino";
            default: return null;
        }
    }

    public String InputCoin() {
        if(CoinsCount<0) return "Error";
        CoinsCount++;
        return Integer.toString(CoinsCount);
    }
    //Stub method to check the work of the main method
    public String MakeCoff(String CoffeType) {
        CoffBusyState = false;
        return "Serving"+" "+CoffeType;
    }
}
