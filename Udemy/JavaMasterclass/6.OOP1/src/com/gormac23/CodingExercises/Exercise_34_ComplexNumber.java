package com.gormac23.CodingExercises;

public class Exercise_34_ComplexNumber {

    private  double real;
    private  double imaginary;

    public Exercise_34_ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Exercise_34_ComplexNumber other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(Exercise_34_ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }
}
