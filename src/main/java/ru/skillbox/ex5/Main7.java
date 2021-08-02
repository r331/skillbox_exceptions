package ru.skillbox.ex5;

import java.io.IOException;

public class Main7 {
    static void finallyReturn() throws IOException {
        String s = null;
        try {
            throw new IOException();
        } finally {
            s.length();
        }
    }

}
