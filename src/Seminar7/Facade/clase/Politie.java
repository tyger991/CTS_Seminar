package Seminar7.Facade.clase;

class Politie {
    public static boolean isUrmarit(Persoana persoana){
        if(Integer.parseInt(""+persoana.getCnp().charAt(12))%2==0){
            return true;
        }
        else  return false;
    }
}
