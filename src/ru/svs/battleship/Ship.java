package ru.svs.battleship;

import java.util.ArrayList;

public class Ship {
    private ArrayList <String> location;

    public Ship(ArrayList<String> location) {
        this.location = location;
    }

    public Ship() {

    }


    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Ship{" +
                "location=" + location +
                '}';
    }



    public String checkShip (String shot){
        String result = "Мимо";
        int index = location.indexOf(shot);

        if (index != -1){
            result = "Ранил";
            location.remove(index);
        }
        if (location.isEmpty()){
            result = "Потоплен";
        }
        return result;
    }
}
