package Seminar11.Memento;

import Seminar11.Memento.clase.ManagerMemento;
import Seminar11.Memento.clase.Meci;

public class Main {
    public static void main(String[] args) {

        Meci meci = new Meci("Liverpool", "Chelsea", 200, 200, 50, 20);

        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(meci.creazaMemento());

        meci.setNrSpectatori(150);
        managerMemento.adaugaMemento(meci.creazaMemento());

        System.out.println(meci.toString());
        meci.seteazaMemento(managerMemento.cereUltimulMemento());
        System.out.println(meci.toString());
        meci.seteazaMemento(managerMemento.cereUltimulMemento());
    }
}
