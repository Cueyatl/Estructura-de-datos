//Algoritmo Sha-256, input: int convertido a String. devuelve String.
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    public byte[] calculateHashCode(String input) {

  

        try {
            // Get instance of SHA-256 message digest
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

            // Update the digest with the input bytes
            byte[] hashBytes = sha256.digest(input.getBytes());

            // Convert the byte array to a hexadecimal string
            String hashString = bytesToHex(hashBytes);

            // Print the SHA-256 hash
            System.out.println("SHA-256 Hash: " + hashString);
            return hashBytes;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Capture the stack trace in a string
            return null;

        }
    }

    // Helper method to convert a byte array to a hexadecimal string
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

}
