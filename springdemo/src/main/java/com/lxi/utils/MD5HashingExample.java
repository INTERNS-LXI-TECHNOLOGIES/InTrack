package com.lxisoft.utils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5HashingExample {

    public static void main(String[] args) {
        String originalString = "password";
        String hashedString = hashWithMD5(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Hashed: " + hashedString);
    }

    public static String hashWithMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}