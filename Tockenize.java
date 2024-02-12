import java.util.Scanner;
import java.util.StringTokenizer;

public class Tockenize {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a line of numbers :");
        String input = s.next();
        s.close();
        StringTokenizer st = new StringTokenizer(input,",");
        int sum = 0;
        while(st.hasMoreTokens()){
            int n = 0;
            n = Integer.parseInt(st.nextToken());
            System.out.println("Number is "+n);
            sum += n;
        }
        System.out.println("Sumof numbers : "+sum);
    }
    
}