import java.util.Scanner;

public class Problem1Fixed {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Inputweight = input.nextInt();
        System.out.print(EvenWatermelon(Inputweight));
    }
    public static String EvenWatermelon (int weight){
        if(weight>100) return "Out of range";
        else if(weight<1) return "Invalid";
        else if(weight==2) return "No";
        else if(weight%2==0) return "Yes";
        else return ("No");
    }

}
