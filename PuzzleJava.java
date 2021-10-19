import java.util.ArrayList;
import java.util.Random;



public class PuzzleJava{



    public ArrayList<Integer> Random(){

        ArrayList<Integer> random = new ArrayList<Integer>();
        Random randinstance = new Random();

        for (int i = 1; i <=10; i++) {
            random.add(randinstance.nextInt(20));
        }

        return random;
    }
    
    
    public String randomLetter() {
        Random randinstance = new Random();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] array = new String[25];
        for (int i = 0; i < 25; i++) {
            array[i] = String.valueOf(alphabet.charAt(i));
        }
        return array[randinstance.nextInt(25)];
    }



    public String generatePassword() {

        String password = "";

        for(int i = 0; i < 8; i++) {
            password = password + randomLetter();
        }
        return password;
    }



    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            newPassword.add(generatePassword());
        }
        return newPassword;

    }



 



}