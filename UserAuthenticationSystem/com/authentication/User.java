package com.authentication;

public class User {
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    // Inner class for password validation
    public class PasswordValidator {
        public boolean validate(String inputPassword) {
            return password.equals(inputPassword);
        }
    }
}
