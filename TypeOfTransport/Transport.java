package ru.kaznu.ruslan.OOP3.TypeOfTransport;

public abstract class Transport {
    protected String name;
    protected int fuelOrEnergy; // Для топлива или энергии (если применимо)

    public Transport(String name, int fuelOrEnergy) {
        this.name = name;
        this.fuelOrEnergy = fuelOrEnergy;
    }

    public abstract boolean canMove(Biom biom); // Проверка на возможность перемещения
    public abstract boolean move(int distance, Biom biom); // Перемещение

    public String getName() {
        return name;
    }
}

