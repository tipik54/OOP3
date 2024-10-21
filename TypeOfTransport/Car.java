package ru.kaznu.ruslan.OOP3.TypeOfTransport;

public class Car extends Transport{
    public Car(int fuel) {
        super("Машина", fuel);
    }

    @Override
    public boolean canMove(Biom biom) {
        return biom != Biom.FOREST && biom != Biom.SWAMP;
    }

    @Override
    public boolean move(int distance, Biom biom) {
        if (canMove(biom) && fuelOrEnergy >= distance) {
            fuelOrEnergy -= distance; // Тратим топливо
            System.out.println(name + " проехала " + distance + " км по " + biom);
            return true;
        } else if (canMove(biom) && fuelOrEnergy <= distance) {
            System.out.println(name + " недостаточно топлива.");
            return false;
        } else {
            System.out.println(name + " не может двигаться по " + biom);
            return false;
        }
    }
}
