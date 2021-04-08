package Seminar7.Facade.clase;

class BirouDeCredite {
    public static boolean areCredite(Persoana persoana){
        return Integer.parseInt(""+persoana.getCnp().charAt(12))%2==0;
    }
}
