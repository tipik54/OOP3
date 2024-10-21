package ru.kaznu.ruslan.OOP3;

import ru.kaznu.ruslan.OOP3.TypeOfTransport.Transport;
import ru.kaznu.ruslan.OOP3.TypeOfTransport.Biom;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void getIntoTransport(Transport transport) {
        currentTransport = transport;
        System.out.println(name + " теперь управляет " + transport.getName());
    }

    public void getOffTransport(Transport transport) {
        if (currentTransport != null) {

            System.out.println(name + " перестал управлять " + transport.getName());
            currentTransport = null;
        } else {
            System.out.println(name + " уже вне транспорта");
        }
    }

    public void move(int distance, Biom biom) {
        if (currentTransport != null) {
            if (!currentTransport.move(distance, biom)) {
                System.out.println(name + " не смог переместиться на транспорте.");
            }
        } else {
            System.out.println(name + " идет пешком " + distance + " км по " + biom);
        }

    }
}
