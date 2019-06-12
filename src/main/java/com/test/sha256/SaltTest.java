package com.test.sha256;

import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;

public class SaltTest {
  static MessageDigestPasswordEncoder passwordEncoder = new MessageDigestPasswordEncoder("SHA-256", false);

  public static void main(String[] args) {

    String password = "password";

    String salt = "1234";

    try {
      password = passwordEncoder.encodePassword(password, salt);

      System.out.println("convert passwd: " + password);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
