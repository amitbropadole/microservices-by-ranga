package com.in28minutes.microservices.limits_service;
public class Limits {
    private int minimum;
    private int maximum;

    // No-argument constructor
    public Limits() {
    }

    // Constructor with fields
    public Limits(int minimum, int maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    // Getters and Setters
    public int getMinimum() {return minimum;}

    public void setMinimum(int minimum) {this.minimum = minimum;}

    public int getMaximum() {return maximum;}

    public void setMaximum(int maximum) {this.maximum = maximum;}
}
