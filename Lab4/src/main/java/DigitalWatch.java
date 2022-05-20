public class DigitalWatch {
    private String Time;
    private String Date;
    private String AlarmTime;
    private boolean AlarmState;

    public DigitalWatch(String time, String date, String alarmTime, boolean alarmState) {
        Time = time;
        Date = date;
        AlarmTime = alarmTime;
        AlarmState = alarmState;
    }

    public DigitalWatch() {
    }

    //setters only used to the help of tester
    public void setAlarmTime(String alarmTime) {
        AlarmTime = alarmTime;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String AdjustAlarm(boolean alarmstate,String Alarm){
        if(Alarm.length() > 8) return "false input";
        AlarmState=alarmstate;
        AlarmTime= Alarm;
        return "Done";
    }
    public String Alarm(){
        String Temp = ViewTimeAndDate();
        if(AlarmState=false) return "Alarm is Off";
        else if(AlarmTime+" "+Date==Temp){
            return "Ring";
        }
        else return null;
    }

    public String ViewTimeAndDate(){
        return Time+" "+Date;
    }
}
