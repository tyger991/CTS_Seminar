package Seminar11.Template;

import Seminar11.Template.clase.Spectator;
import Seminar11.Template.clase.SpectatorAbstract;
import Seminar11.Template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {

        SpectatorAbstract spectator1 = new SpectatorVIP("Ronaldo");
        SpectatorAbstract spectator2 = new Spectator("Gigel");

        spectator1.intrareInStadion();
        spectator2.intrareInStadion();
    }
}
