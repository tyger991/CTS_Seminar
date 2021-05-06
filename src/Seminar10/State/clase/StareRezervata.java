package Seminar10.State.clase;

public class StareRezervata implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Masa cu numarul " + masa.getNumar() + " este rezervata.");
            masa.setStare(this);
        }
        else{
            System.out.println("masa nu poate fi rezervata");
        }
    }
}
