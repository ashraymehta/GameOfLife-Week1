package com.company;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Cell> aliveCells;

    public static void main(String[] args) {
	    aliveCells = Console.getInput();
        ArrayList<Cell> neighbours = Cell.getAliveNeighbours(aliveCells.get(2), aliveCells);
        System.out.println(neighbours.size());
    }

    public static void moveToNextGeneration() {
        int size = aliveCells.size();
        for(int i=0; i<size; i++) {
            ArrayList<Cell> neighbours = Cell.getAliveNeighbours(aliveCells.get(i), aliveCells);
            if(neighbours.size() != 2 || neighbours.size() == 3) {

            }
        }
    }
}
