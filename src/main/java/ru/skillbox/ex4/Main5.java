package ru.skillbox.ex4;

public class Main5 {
    public static void main(String[] args) {
       // divide100byInt(20);
        //divide100byInt(0);
        //divide100byInt(10);
    }

    /**
     * @param a - int
     * @throws InvalidParameterException выбрасывается если входной параметр равен 0
     */
    static void divide100byInt(int a) throws InvalidParameterException {
        if (a == 0)
            throw new InvalidParameterException();
        System.out.println(100 / a);
    }
}