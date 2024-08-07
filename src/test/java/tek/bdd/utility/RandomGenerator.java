package tek.bdd.utility;
import java.util.Random;
public class RandomGenerator {
    public static String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder(5);
        for(int i = 0; i<7;i++){
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }
        return randomString.toString()+"@gmail.com";
    }
}
