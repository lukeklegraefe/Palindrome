import java.util.Scanner;

public class palindromeChecker {

    public static String check(String input){
        String formattedInput = input.replaceAll("\\s+","");
        int i = 0;                                                                                          //set the first char to 0th position
        int j = formattedInput.length();                                                                             //last char to last position
        boolean pal = true;
        if(formattedInput.equals("")){
            return "ERROR: Please enter a valid word/phrase.";
        }
        while(i < j) {                                                                                      //run until i & j meet
            if (formattedInput.toLowerCase().charAt(i) != formattedInput.toLowerCase().charAt(j - 1)) {     //checks the two chars, disregarding case
                pal = false;
                return input + " is not a palindrome.";
            }
            i++;                                                                                            //step i and j respectively
            j--;
        }
        if(pal){
            return input + " is a palindrome.";
        }
        else{
            return "Not a valid word";
        }
    }
}
