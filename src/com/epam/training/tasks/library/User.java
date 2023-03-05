package com.epam.training.tasks.library;

public class User {

  private int id;
  private String username;
  private String password;
  private Role role;
  private Email email;

  public User(int id, String username, String password, Role role, Email email) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.role = role;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Email getEmail() {
    return email;
  }

  public void setEmail(Email email) {
    this.email = email;
  }
}
