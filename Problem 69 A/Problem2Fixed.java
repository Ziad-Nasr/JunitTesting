import java.util.*;
public class Problem2Fixed {
    public static void main(String[] args) {
        var Input = new Scanner(System.in);
        int InputNumLines = Input.nextInt();
        int NumLines = InputNumLines;
        var Bodies = new int[NumLines][3];
        for(int i=0;i<NumLines;i++)
            for(int j=0;j<3;j++){
                int InputValues = Input.nextInt();
                Bodies[i][j]= InputValues;
            }
        System.out.print(CheckEquilibrium(Bodies,NumLines));
    }
    public static String CheckEquilibrium(int[][] Values,int NumLines) {
        if(NumLines < 1) return "Invalid";
        for (int i = 0; i < 3; i++) {
            int sum = 0;
                for (int j = 0; j < NumLines; j++) {
                    if(Values[j][i] > 100 || Values[j][i] < -100) return "Out of bounds";
                    sum += Values[j][i];
                }
            if(sum!=0) return "NO";
        }
        return "YES";
    }

}
