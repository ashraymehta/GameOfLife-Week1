package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ashrayme on 01/06/15.
 */
public class Console {

    public static ArrayList<Cell> getInput() {
        final String ERROR = "Couldn't get input.";
        System.out.println("Enter number of alive cells:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int aliveCells = 0;
        try {
            aliveCells = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(ERROR);
            return null;
        }
        ArrayList<Cell> coords = new ArrayList<>();

        for(int i=0; i<aliveCells; i++) {
            Cell tempCell = new Cell();
            try {
                System.out.println("Enter coordX for cell " + (i+1) + " : ");
                int coordX = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter coordY for cell " + (i+1) + " : ");
                int coordY = Integer.parseInt(bufferedReader.readLine());
                tempCell.setCordX(coordX);
                tempCell.setCordY(coordY);
                coords.add(tempCell);
            }catch (IOException e) {
                System.out.println(ERROR);
                return null;
            }
        }
        return coords;
    }
}
