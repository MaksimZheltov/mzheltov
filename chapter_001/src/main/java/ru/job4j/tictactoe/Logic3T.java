package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = true;
        for (int row = 0; row < this.table.length; row++) {
            result = true;
            for (int cell = 0; cell < this.table.length - 1; cell++) {
                if (!(this.table[row][cell].hasMarkX() && this.table[row][cell + 1].hasMarkX())) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
        //return false;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table.length; j++) {
                if (!this.table[i][j].hasMarkX() && !this.table[i][j].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        return result;

        //return true;
    }
}