package Seminar9.Flyweight;


import Seminar9.Flyweight.clase.Flyweight;
import Seminar9.Flyweight.clase.FlyweightFactory;
import Seminar9.Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(10, 5, 15);
        Rezervare rezervare2 = new Rezervare(12, 2, 21);
        Rezervare rezervare3 = new Rezervare(14, 4, 16);
        Rezervare rezervare4 = new Rezervare(18, 6, 20);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight clienti = flyweightFactory.getFlyweight("0785290893");
        clienti.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("0829321").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyweight("0829321").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("0785290893").printeazaRezervare(rezervare4);

    }
}
