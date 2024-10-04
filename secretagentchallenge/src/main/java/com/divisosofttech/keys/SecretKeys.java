package com.divisosofttech.keys;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretKeys {

    public static Map<String, String> keys = new LinkedHashMap<>();

    public static String[] answerKeys = new String[21];

    static {
        answerKeys[0] = "";
        answerKeys[1] = "";
        answerKeys[2] = "";
        answerKeys[3] = "";
        answerKeys[4] = "";
        answerKeys[5] = "";
        answerKeys[6] = "";
        answerKeys[7] = "";
        answerKeys[8] = "";
        answerKeys[9] = "";
       
       
    }

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

    public static void checkAnswerKeyForLevels() {

        String[] hashes = (String[]) keys.values().toArray(new String[0]);
        boolean allMatch = true;
        for (int i = 0; i < hashes.length ; i++) {
            if (getMD5Hash(answerKeys[i]).equals(hashes[i])) {
                System.out.println("Wow! Way to go you cracked level :" + i);
            } else {
                System.out.println("SORRY! Failed to crack level :" + i);
                allMatch = false;
            }

        }
        if (allMatch) {
            System.out.println("You CRACKED THE TREASURE AND EARNED THE CASH PRICE");

        } else {
            System.out.println("Try again, You failed a level");
        }

    }

}
