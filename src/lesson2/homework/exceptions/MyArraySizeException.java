package lesson2.homework.exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неправильный размер массива");
    }
}
