package lesson2.homework.exceptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j, String str, Throwable thr){
        super(String.format("Некорректное значение %s в ячейке %d-%d",str,i,j),thr);
    }
}
