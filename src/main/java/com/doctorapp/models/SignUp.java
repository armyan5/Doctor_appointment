package com.doctorapp.models;

public class SignUp {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public SignUp setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public SignUp setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public SignUp setEmail(String email) {
        this.email = email;
        return this;
    }

    public SignUp setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
