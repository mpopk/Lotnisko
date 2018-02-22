package com.kodilla.sudoku;

public class SudokuElement {

    public static int EMPTY = -1;

    SudokuElement value = new SudokuElement(){
    };

    public SudokuElement(SudokuElement value) {
        this.value = value;
    }

    public SudokuElement getValue() {
        return value;
    }

    public void setValue(SudokuElement value) {
        this.value = value;
    }
}




