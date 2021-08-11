package com.myprojects.orderservice.model;

public class User {
    private String grant_type;
    private String username;
    private String password;

    public User(String grant_type, String username, String password) {
        this.grant_type = grant_type;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
