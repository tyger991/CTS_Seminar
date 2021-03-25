package Seminar5.FactoryMethod;

import Seminar5.FactoryMethod.clase.*;

public class Main {

    public static void afisareInformatiiPersonalSpital(IFactory factory, String nume){
        PersonalSpital personalSpital = factory.getPersonal(nume);

        System.out.println(personalSpital.toString());
    }

    public static  void main(String[] args){
        afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Albert");
        afisareInformatiiPersonalSpital(new FactoryAsistent(), "Andrei");
        afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Mickey");

    }
}
