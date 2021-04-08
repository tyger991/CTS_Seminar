package Seminar7.Proxy;

import Seminar7.Proxy.clase.Moneda;
import Seminar7.Proxy.clase.OperatorCredite;
import Seminar7.Proxy.clase.OperatorCrediteProxy;

public class Main {
    public static void main(String[] args) {

        OperatorCredite operator = new OperatorCredite();
        operator.creareCredite(Moneda.EUR, 4000);

        OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
        proxy.creareCredite(Moneda.EUR, 4000);
        proxy.creareCredite(Moneda.RON, 5000);


    }
}
