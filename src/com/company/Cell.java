package com.company;

import java.util.ArrayList;

/**
 * Created by ashrayme on 01/06/15.
 */
public class Cell {
    private int cordX, cordY;

    public Cell() {

    }

    public Cell(int x, int y) {
        setCordX(x);
        setCordY(y);
    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public static ArrayList<Cell> getAliveNeighbours(Cell cell, ArrayList<Cell> aliveCells) {
        ArrayList<Cell> neighbours = new ArrayList<>();
        for(int i=cell.getCordX() - 1; i<=cell.getCordX() + 1; i++) {
            for(int j=cell.getCordY() - 1; j<=cell.getCordY(); j++) {
                Cell testingCell = new Cell(i, j);
                if(aliveCells.contains(testingCell)) {
                    neighbours.add(testingCell);
                }
            }
        }
        return neighbours;
    }

    @Override
    public boolean equals(Object obj) {
        Cell tempCell = (Cell)obj;
        if(tempCell.getCordX() == getCordX() && tempCell.getCordY() == getCordY())
            return true;
        else
            return false;
    }
}
