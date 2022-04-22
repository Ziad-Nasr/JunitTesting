import java.util.*;
public class Problem1 {
 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        if(a==2) System.out.print("No");
        else if(a%2==0) System.out.print("Yes");
        else System.out.print("No");
    }
}