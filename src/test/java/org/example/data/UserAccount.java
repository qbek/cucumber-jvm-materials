package org.example.data;

public class UserAccount {

    private String login;
    private String password;

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "login: " + login + ", pass: " + password;
    }
}