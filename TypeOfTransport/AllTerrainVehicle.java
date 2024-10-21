package ru.kaznu.ruslan.OOP3.TypeOfTransport;

public class AllTerrainVehicle extends Transport{
    public AllTerrainVehicle(int fuel) {
        super("Вездеход", fuel);
    }

    @Override
    public boolean canMove(Biom biom) {
        // Вездеход может перемещаться по любой местности
        return true;
    }

    @Override
    public boolean move(int distance, Biom biom) {
        if (fuelOrEnergy >= distance) {
            fuelOrEnergy -= distance; // Тратим топливо
            System.out.println(name + " проехал " + distance + " км по " + biom);
            return true;
        }
        System.out.println(name + " недостаточно топлива.");
        return false;
    }
}
