import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args){
        Scanner stream = new Scanner(System.in);
        String input = "";
        boolean p;

        while(!input.equals("Q")){
            System.out.print("\nPlease enter the word you would like to check (Q to exit): ");
            input = stream.nextLine();
            if(!input.equals("Q")) {
                p = check(input);
            }
            else{
                System.exit(0);
            }
        }
    }

    public static Boolean check(String input){
        int i = 0;                                                                                          //set the first char to 0th position
        int j = input.length();                                                                             //last char to last position
        while(i < j) {                                                                                      //run until i & j meet
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j - 1))) {     //checks the two chars, disregarding case
                System.out.println(input + " is not a palindrome. First mismatch is '" + input.charAt(i) +
                        "' (position " + i + ") and '" + input.charAt(j - 1) + "' (position " + j + ")");

                return false;                                                                               //break if any one of the chars do not match
            }
            i++;                                                                                            //step i and j respectively
            j--;
        }
        System.out.println(input + " is a palindrome.");
        return true;                                                                                        //otherwise, everything matches
    }
}
