package ru.svs.battleship;

import java.util.ArrayList;
import java.util.Scanner;

public class Battle {
    static Scanner scan = new Scanner(System.in);

    public static void main (String [] args){
        ArrayList <String> location = new ArrayList<>(7);
        location.add("2");
        location.add("3");
        location.add("4");
        Ship ship = new Ship();
        ship.setLocation(location);
        while (!location.isEmpty()){
            System.out.println( ship.checkShip(hit()));
        }
    }

    public static String hit (){
        System.out.println("Введите координаты выстрела - ");
        return scan.next();
    }





}
