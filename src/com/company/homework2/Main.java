package com.company.homework2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] array_error1 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        String[][] array_error2 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "array10", "11", "12"},
                {"13", "14", "array15", "16"}
        };
        String[][] array_correct = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
                //arr(array_error1); //ошибка размерности
                arr(array_error2); // ошибка преобразования элементов
               //arr(array_correct);

        } catch (MyArraySizeException e){
                e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }

    public static void arr(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if(array.length!=4) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) {
            if(array[i].length!=4) throw  new MyArraySizeException();
            for(int j = 0; j < array[i].length; j++){
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
