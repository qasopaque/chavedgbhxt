import java.security.SecureRandom;
import javax.crypto.spec.IvParameterSpec;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.next(); // 128 bit key
        String initVector = "RandomInitVector"; // 16 bytes IV

        System.out.println(Encryptor.decrypt(key, initVector,
                Encryptor.encrypt(key, initVector, "Hello World")));
    }
}