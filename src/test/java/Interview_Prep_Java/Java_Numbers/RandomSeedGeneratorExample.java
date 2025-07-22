package Interview_Prep_Java.Java_Numbers;

import java.security.SecureRandom;
import java.util.Arrays;

public class RandomSeedGeneratorExample {

    public static void main(String[] args) {
        byte[] randomSeed = generateSeed(16); // 16 bytes seed for illustration  
        System.out.println("Random Seed: " + Arrays.toString(randomSeed));  
    }

    public static byte[] generateSeed(int size) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = new byte[size];
        secureRandom.nextBytes(seed);
        return seed;
    }
}
