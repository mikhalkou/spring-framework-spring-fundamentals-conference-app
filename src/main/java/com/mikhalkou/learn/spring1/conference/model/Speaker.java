package com.mikhalkou.learn.spring1.conference.model;

import java.util.Date;
import java.util.StringJoiner;

public class Speaker {
    private String firstName;
    private String lastName;
    private Date seedValidTo;
    private double seed;

    public double getSeed() {
        return seed;
    }

    public void setSeed(double seed) {
        this.seed = seed;
    }

    public Date getSeedValidTo() {
        return seedValidTo;
    }

    public void setSeedValidTo(Date seedValidTo) {
        this.seedValidTo = seedValidTo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Speaker.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("seedValidTo=" + seedValidTo)
                .add("seed=" + seed)
                .toString();
    }
}
