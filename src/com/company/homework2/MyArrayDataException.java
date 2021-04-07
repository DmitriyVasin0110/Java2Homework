package com.company.homework2;

public class MyArrayDataException extends NumberFormatException{
    int i, j;
    public MyArrayDataException(int i, int j){
        super("Невозможно преобразовать элемент массива в ячейке " + i + " " + j);
        this.i = i;
        this.j = j;
    }
}
