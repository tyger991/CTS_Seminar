package Seminar10.Strategy;

import Seminar10.Strategy.clase.Client;
import Seminar10.Strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Claudiu");

        client.plateste(30);
        client.setTipPlata(new PlataCard());
        client.plateste(25);

    }
}
