package com.divisosofttech.keys;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretKeys {

    public static Map<String, String> keys = new HashMap<>();

    static {

        keys.put("LEVEL1", "a062320a14b6cb765abcfcfe372fd9d1");
        keys.put("LEVEL2", "7895e26c5aed279288647ccd93f5b272");
        keys.put("LEVEL3", "13bfe7c454209ce8bba16c5a915faa28");
        keys.put("LEVEL4", "c86ee0d9d7ed3e7b4fdbf486fa6c0ebb");
        keys.put("LEVEL5", "c7a92a987e6d6d243465686da482a77c");
        keys.put("LEVEL6", "558ffc8f5770d8e4f95f51d822685532");
        keys.put("LEVEL7", "f4703220523fec5643c84e272b50bada");
        keys.put("LEVEL8", "13598bc4f25b5c6faef9ff2aed2bc510");
        keys.put("LEVEL9", "2399122c182da0d5946e2937bb73edf2");
        keys.put("LEVEL10", "bf5c1d5c27ebae23954367aff15bf344");
        keys.put("LEVEL11", "215ac9dcf8fff13c0993a67a0be94747");
        keys.put("LEVEL12", "0bfc16cc12effc1bae4d3766c4f2257d");
        keys.put("LEVEL13", "9b520b10321bab9e8dcef042ddef6e49");
        keys.put("LEVEL14", "b1e5b15ab34e89de8faf65a0d88d1c64");
        keys.put("LEVEL15", "13598bc4f25b5c6faef9ff2aed2bc510");
        keys.put("LEVEL16", "5b1d59b5451c06afb65ab1bc2713cfb4");
        keys.put("LEVEL17", "4905ac9d6a22bdfc1ae096094ce6248d");
        keys.put("LEVEL18", "8e63dcd86ef9574181a9b6184ed3dde5");
        keys.put("LEVEL19", "fc91b14eef9c58c4cad8fdf87b4c0bea");
        keys.put("LEVEL20", "07331cdec962e140b22cfac41caf00c5");
        keys.put("FINAL", "171c4a37ab565774953d2bcbfac45bfa");

    }

    
    public static void checkAnswerKeyForLevel() {
        System.out.println("Enter Level ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Secret Key");
        String key = s.nextLine();

        if (input.equals("FINAL")) {

            if (getMD5Hash(key).equals(keys.get(input))) {
                System.out.println("Wow! Way to go you cracked level :" + input);
            } else {
                System.out.println("Sorry! Try harder! Better luck next time");
            }
        } else if (getMD5Hash(key).equals(keys.get("LEVEL" + input))) {
            System.out.println("Wow! Way to go you cracked level :" + input);
        } else {
            System.out.println("Sorry! Try harder! Better luck next time");
        }
    }

    public static String getMD5Hash(String input) {
        try {
            // Create MD5 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update the MessageDigest with input bytes
            md.update(input.getBytes());

            // Convert the byte array to a hexadecimal string
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();

            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
