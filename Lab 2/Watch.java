public class Watch {
    
    private String state ;
    private String InsideState;
    private int m=0;
    private int h=0;
    private int D=1;
    private int M=1;
    private int Y=2000;

    public Watch() {
        state = "NORMAL";
        InsideState = "TIME";
        m = 0;
        h = 0;
        D = 1;
        M = 1;
        Y = 2000;
    }

    public String watchOperating(char input) {
        switch (state) {
            case ("NORMAL"): {
                if (input == 'c') {
                    state = "UPDATE";
                    InsideState="MIN";
                    return InsideState;
                }
                if (input == 'b'){
                    state = "ALARM";
                    InsideState = "ALARM";
                    return InsideState;
                }
                if (input == 'a')
                    if (InsideState == "TIME") {
                        InsideState = "DATE";
                    }
                    else InsideState = "TIME";
                    return InsideState;
            }
            case ("UPDATE"): {
                if (input =='d'){
                    state = "NORMAL";
                    InsideState = "TIME";
                    return InsideState;
                }
                if (input =='a'){
                    if (InsideState.equalsIgnoreCase("MIN")) {
                        InsideState= "HOUR";
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("HOUR")) {
                        InsideState = "DAY";
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("DAY")) {
                        InsideState = "MONTH";
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("MONTH")) {
                        InsideState = "YEAR";
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("YEAR")) {
                        state = "NORMAL";
                        InsideState = "TIME";
                        return InsideState;
                    }
                }
                if (input =='b') {
                    if (InsideState.equalsIgnoreCase("MIN")) {
                        if(m==60) m=0;
                        else m++;
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("HOUR")) {
                        if(h==24) h=0;
                        else h++;
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("DAY")) {
                        if(D==31) D=0;
                        else D++;
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("MONTH")) {
                        if(M==12) M=1;
                        else M++;
                        return InsideState;
                    }
                    if (InsideState.equalsIgnoreCase("YEAR")) {
                        if(Y==2100) Y=2000;
                        else Y++;
                        return InsideState;
                    }
                }
            }
            case("ALARM"):{
                if (input=='a'){
                    if(InsideState.equalsIgnoreCase("ALARM")) {
                        InsideState = "CHIME";
                        return InsideState;
                    }
                }
                if (input=='d'){
                    state="NORMAL";
                    InsideState="TIME";
                    return InsideState;
                }
            }
        }
        return InsideState;
    }
    public void DisplayDate() {
        System.out.print (Y+"-"+M+"-"+D);
    }
    public void DisplayTIME() {
        System.out.print (h+":"+m);
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setInsideState(String InsideState) {
        this.InsideState = InsideState;
    }

}
