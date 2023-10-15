import java.util.*;
public class frequency {
    public static void main(String args[]){
        int[] a = {1,2,3,2,4,5};
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter an Integer :");
        int key = sc.nextInt();
        int i = 0;
        int count = 0; 
        while(i < a.length){
            if(key == a[i]){
                count++;
                i++;
            }
            else    
                i++;
        }
        System.out.println("frequency of "+key+ " In the array = "+count);
        sc.close();
    }
}
