import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args){
        Scanner stream = new Scanner(System.in);
        String input = "";

        while(!input.equals("Q")){
            System.out.print("\nPlease enter the word you would like to check (Q to exit): ");
            input = stream.nextLine();
            if(!input.equals("Q")) {
                check(input);
            }
            else{
                System.exit(0);
            }
        }
    }

    public static void check(String input){
        String formattedInput = input.replaceAll("\\s+","");
        int i = 0;                                                                                          //set the first char to 0th position
        int j = formattedInput.length();                                                                             //last char to last position
        boolean pal = true;
        while(i < j) {                                                                                      //run until i & j meet
            if (Character.toLowerCase(formattedInput.charAt(i)) != Character.toLowerCase(formattedInput.charAt(j - 1))) {     //checks the two chars, disregarding case
                System.out.println(input + " is not a palindrome. First mismatch is '" + formattedInput.charAt(i) +
                        "' (position " + i + ") and '" + formattedInput.charAt(j - 1) + "' (position " + j + ")");
                pal = false;
                break;
            }
            i++;                                                                                            //step i and j respectively
            j--;
        }
        if(pal){
            System.out.println(input + " is a palindrome.");
        }
    }
}
