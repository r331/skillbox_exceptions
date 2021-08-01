package ru.skillbox.ex4;

public class Main3 {
    public static void main(String[] args) {
        calc();
    }

    private static void calc() {
        print();
    }

    private static void print() {
        throw new RuntimeException();
    }
}
