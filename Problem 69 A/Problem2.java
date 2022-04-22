import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        var Input = new Scanner(System.in);
        int InputNumLines = Input.nextInt();
        int NumLines = InputNumLines;
        var Bodies= new int[NumLines][3];
        for(int i=0;i<NumLines;i++)
            for(int j=0;j<3;j++){
                int InputValues = Input.nextInt();
                Bodies[i][j]= InputValues;
            }
        System.out.print(CheckEquilibrium(Bodies,NumLines));
    }
    public static String CheckEquilibrium(int[][] Values,int NumLines) {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < NumLines; j++) {
                sum += Values[j][i];
            }
            if(sum!=0) return "NO";
        }
        return "YES";
    }

}
