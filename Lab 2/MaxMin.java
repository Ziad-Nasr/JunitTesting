public class MaxMin {
    public double FindMinMax(String Operation, double Arr[]){
        if(Operation.equals("min")){
            double Min= Arr[0];
        for(int i=1;i<Arr.length;i++){
          if(Min > Arr[i]) Min = Arr[i];
      }
        return Min;
    }
        if(Operation.equals("max")){
            double Max = Arr[0];
        for(int i=1;i<Arr.length;i++){
            if(Max < Arr[i]) Max = Arr[i];
        }
        return Max;
    }
        else return -1;
    }
}
