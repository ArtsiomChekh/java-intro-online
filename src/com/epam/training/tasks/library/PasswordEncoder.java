package com.epam.training.tasks.library;

    import java.security.MessageDigest;
    import java.security.NoSuchAlgorithmException;

public class PasswordEncoder {

  public static String encodePassword(String password) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    byte[] hashedPassword = md.digest(password.getBytes());
    StringBuilder sb = new StringBuilder();
    for (byte b : hashedPassword) {
      sb.append(String.format("%02x", b));
    }
    return sb.toString();
  }
}
