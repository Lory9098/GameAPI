package me.nettychannell.api.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GameHash {

    public static String generateMD5(String input) {
        return generateHash(input, "MD5");
    }

    public static String generateSHA1(String input) {
        return generateHash(input, "SHA-1");
    }

    public static String generateSHA256(String input) {
        return generateHash(input, "SHA-256");
    }

    public static boolean validateHash(String original, String hash, String algorithm) {
        String calculatedHash = generateHash(original, algorithm);
        return calculatedHash.equals(hash);
    }

    private static String generateHash(String input, String algorithm) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte[] bytes = md.digest(input.getBytes());
            return bytesToHex(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}
