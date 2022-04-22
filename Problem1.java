import java.util.*;
public class Problem1 {
 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Inputweight = input.nextInt();
        System.out.print(EvenWatermelon(Inputweight));
    }
    public static String EvenWatermelon (int weight){
        if(weight==2) System.out.print("No");
        else if(weight%2==0) return "Yes";
        else return ("No");
        return "error";
    }
}