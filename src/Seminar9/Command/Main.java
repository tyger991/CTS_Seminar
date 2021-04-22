package Seminar9.Command;

import Seminar9.Command.clase.*;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        Masa masa2 = new Masa(2);

        Comanda comandaRez = new ComandaRezervare(masa);
        Comanda comandaOcup = new ComandaOcupare(masa2);
        Comanda comandaOcup2 = new ComandaOcupare(masa2);

        Operator operator = new Operator();
        operator.invoca(comandaRez);
        operator.executaComanda();
        operator.invoca(comandaOcup);
        operator.invoca(comandaOcup2);

        operator.executaComanda();
        operator.executaComanda();

    }
}
