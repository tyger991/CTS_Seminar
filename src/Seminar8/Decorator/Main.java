package Seminar8.Decorator;

import Seminar8.Decorator.clase.DecoratorAbstract;
import Seminar8.Decorator.clase.DecoratorCuLaMultiAni;
import Seminar8.Decorator.clase.DecoratorCuPasteFericit;
import Seminar8.Decorator.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {

        NotaDePlata notaInitiala = new NotaDePlata(55);
        notaInitiala.printeaza();

        DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
        decoratorLaMultiAni.printeazaFelicitare();
        System.out.println();
        decoratorLaMultiAni.printeaza();

        DecoratorAbstract decoratorDePaste = new DecoratorCuPasteFericit(notaInitiala);
        decoratorDePaste.printeaza();

        NotaDePlata notaDePlata = new NotaDePlata(150);
        DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
        DecoratorAbstract decoratorDePaste2 = new DecoratorCuPasteFericit(decoratorLaMultiAni2);
        decoratorDePaste2.printeaza();
    }
}
