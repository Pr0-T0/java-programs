import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Permutations of " + input + ":");
        generatePermutations(input, 0, input.length() - 1);
    }

    public static void generatePermutations(String input, int start, int end) {
        if (start == end) {
            System.out.println(input);
        } else {
            for (int i = start; i <= end; i++) {
                input = swap(input, start, i);
                generatePermutations(input, start + 1, end);
                input = swap(input, start, i); 
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
