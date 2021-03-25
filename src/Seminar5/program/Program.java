package Seminar5.program;

import Seminar5.clase.Asistent;
import Seminar5.clase.FactoryPersonal;
import Seminar5.clase.PersonalSpital;
import Seminar5.clase.TipPersonal;

public class Program {
    public static  void main(String[] args){
        FactoryPersonal factoryPersonal = new FactoryPersonal();

        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent,"Mircea");
        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Frankie");

        System.out.println(asistent);
        System.out.println(medic);
    }
}
