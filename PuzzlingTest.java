import java.util.ArrayList;
import java.util.Random;


public class PuzzlingTest {
    

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.Random();
        System.out.println(randomRolls);
        String alphabet = generator.randomLetter();

        System.out.println(alphabet);
        String password= generator.generatePassword();
        System.out.println(password);


        int length=9;
        ArrayList<String> newPassword= generator.getNewPasswordSet(length);
        System.out.println(newPassword);





        
      
    }

    
}


