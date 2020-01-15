import java.util.Scanner;
public class FUC {

    //Function to check for duplicates in a word
    private static boolean hasDuplicate(char letter, String mia){
        int count = 0;
        for (int i = 0; i < mia.length(); i++){
            if (letter == mia.charAt(i)){
                count++;
            }
        }
        
        if (count > 1)
            return true;    
        else
            return false;
        
    }
    
    private static char firstUniqueChar(String mia){
        char unique = '-';
        
        mia = mia.toLowerCase();//Since the test cases would be case insensitive
        
        for (int i = 0; i < mia.length(); i++){
            //Condition to ignore space
            if (mia.charAt(i) == ' '){
                continue; //The continue key word makes the program skip the remaing part of the current iteration in the loop and move on to the next iteration
            }
            if (!hasDuplicate(mia.charAt(i), mia))
                return mia.charAt(i); // This is the unique character since it has no duplicates
            
        }
        
        return unique;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        while (true){
            Scanner s = new Scanner(System.in);
            String mia = s.nextLine();
            System.out.println(firstUniqueChar(mia));
        }
        
        
    }
    
}
