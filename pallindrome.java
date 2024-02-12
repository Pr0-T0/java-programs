import java.util.Scanner;
public class pallindrome {
    static boolean Ispallindrome(String s, int len){
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) == s.charAt(len))
                len--;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = s.nextLine();
        int len = input.length() - 1;
        if(Ispallindrome(input, len))
            System.out.println("pallindrome!");
        else
            System.out.println("Not a pallindrome!");
        s.close();
    }
}
