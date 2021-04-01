package Seminar6.Builder;

import Seminar6.Builder.clase.Rezervare;
import Seminar6.Builder.clase.RezervareBuilder;
import Seminar6.Builder.clase.RezervareBuilderV2;

public class Main {
    public static  void main(String[] args) {
        Rezervare rezervare1;

        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        rezervareBuilder.setCodRezervare(101);
        rezervareBuilder.setAreMancare(true);
        rezervare1 = rezervareBuilder.build();


        Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(103).setAreMuzica(true).build();

        Rezervare rezervare3 = new Rezervare(104,true,true,true, "ambientala");

        Rezervare rezervare4;
        rezervareBuilder.setCodRezervare(105).setAreMancare(true);
        rezervare4 = rezervareBuilder.build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);

        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreScaunErgonomic(true);
        Rezervare rezervare5 = rezervareBuilderV2.setCodRezervare(1001).build();
        Rezervare rezervare6 = rezervareBuilderV2.setCodRezervare(1002).build();

        System.out.println("----------------");
        System.out.println(rezervare5);
        System.out.println(rezervare6);




    }
}

