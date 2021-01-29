import java.util.Scanner;
public class palindromeChecker {
    public static void main(String[] args){
        Scanner stream = new Scanner(System.in);
        String input = "";
        while(!input.equals("Q")) {
            System.out.print("\nPlease type the word you would like to check (Q to exit): ");
            input = stream.nextLine();
            if(input.equals("Q"))
                System.exit(0);
            boolean p = check(input);
        }
    }

    public static Boolean check(String input){
        int i = 0;                                                                                                      //set the first char to 0th position
        int j = input.length();                                                                                         //set the last char to nth position
        while(i < j) {                                                                                                  //run until i & j meet
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j - 1))) {                 //checks the two chars, disregarding case
                System.out.println(input + " is not a palindrome.");
                System.out.println("The first mismatch is at '" + input.charAt(i) + "' (position " + i +
                                    ") and '" + input.charAt(j - 1) + "' (position " + j + ")");
                return false;                                                                                           //break if any one of the chars do not match
            }
            i++;                                                                                                        //step i and j respectively
            j--;
        }
        System.out.println(input + " is a palindrome.");
        return true;                                                                                                    //otherwise, everything matches
    }
}

//Luke Klegraefe - 1/29/21
