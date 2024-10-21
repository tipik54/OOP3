package ru.kaznu.ruslan.OOP3.TypeOfTransport;

public class Horse extends Transport{
    public Horse(int energy) {
        super("Лошадь", energy);
    }

    @Override
    public boolean canMove(Biom terrain) {
        // Лошадь не может перемещаться по болоту
        return terrain != Biom.SWAMP;
    }

    @Override
    public boolean move(int distance, Biom biom) {
        if (canMove(biom) && fuelOrEnergy >= distance) {
            fuelOrEnergy -= distance; // Тратим топливо
            System.out.println(name + " прошла " + distance + " км по " + biom);
            return true;
        } else if (canMove(biom) && fuelOrEnergy <= distance) {
            System.out.println(name + " устала.");
            return false;
        } else {
            System.out.println(name + " не может двигаться по " + biom);
            return false;
        }
    }
}
