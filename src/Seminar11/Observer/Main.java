package Seminar11.Observer;

import Seminar11.Observer.clase.Client;
import Seminar11.Observer.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Client client = new Client("Dan");
        Client client1 = new Client("Razvan");
        Client client2 = new Client("Claudiu");

        manager.adaugaObservator(client);
        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);

        manager.anuntaMeci("Fotbal");

        manager.stergeObservator(client1);

        manager.anuntaMeci("Baschet");

    }
}
