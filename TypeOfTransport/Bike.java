package ru.kaznu.ruslan.OOP3.TypeOfTransport;

public class Bike extends Transport{
    public Bike() {
        super("Велосипед", 0); // Велосипед не тратит энергии
    }

    @Override
    public boolean canMove(Biom biom) {
        // Велосипед не может перемещаться по болоту
        return biom != Biom.SWAMP;
    }

    @Override
    public boolean move(int distance, Biom biom) {
        if (canMove(biom) && fuelOrEnergy >= distance) {
            fuelOrEnergy -= distance; // Тратим топливо
            System.out.println(name + " проехал " + distance + " км по " + biom);
            return true;
        } else if (canMove(biom) && fuelOrEnergy <= distance) {
            System.out.println(name + " устал.");
            return false;
        } else {
            System.out.println(name + " не может двигаться по " + biom);
            return false;
        }
    }
}
