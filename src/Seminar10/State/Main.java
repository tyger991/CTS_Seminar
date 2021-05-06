package Seminar10.State;

import Seminar10.State.clase.Masa;
import Seminar10.State.clase.StareLibera;

public class Main {
    public static void main(String[] args) {

        Masa masa1 = new Masa(10);

        masa1.elibereazaMasa();
        masa1.rezervaMasa();
        masa1.rezervaMasa();
        masa1.ocupaMasa();

    }
}
