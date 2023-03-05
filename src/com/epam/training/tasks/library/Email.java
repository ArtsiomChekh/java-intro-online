package com.epam.training.tasks.library;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

  private String email;

  public Email(String email) {
    Pattern pattern = Pattern.compile("^[a-z_]{2,20}@[a-z]{2,5}\\.[a-z]{2,3}$");
    Matcher matcher = pattern.matcher(email);

    if (matcher.matches()) {
      this.email = email;
    } else {
      throw new IllegalArgumentException("Illegal email name: " + email);
    }
  }

  public String getEmail() {
    return email;
  }


  @Override
  public String toString() {
    return email;
  }

}
