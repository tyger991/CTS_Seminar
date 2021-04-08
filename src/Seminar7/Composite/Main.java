package Seminar7.Composite;

import Seminar7.Composite.clase.CompositeAgentie;
import Seminar7.Composite.clase.LeafFiliala;

public class Main {
    public static void main(String[] args) {
        CompositeAgentie agentie1 = new CompositeAgentie();
        CompositeAgentie agentie2 = new CompositeAgentie();
        CompositeAgentie agentie3 = new CompositeAgentie();

        LeafFiliala filiala1 = new LeafFiliala("Rahova");
        LeafFiliala filiala2 = new LeafFiliala("Salaj");
        LeafFiliala filiala3 = new LeafFiliala("Buzesti");
        LeafFiliala filiala4 = new LeafFiliala("Unirii");

        agentie1.adaugaNod(filiala1);
        agentie1.adaugaNod(filiala2);
        agentie1.adaugaNod(agentie3);

        agentie2.adaugaNod(filiala3);

        agentie3.adaugaNod(filiala4);

        agentie1.afiseazaDescriere();
        System.out.println();
        agentie2.afiseazaDescriere();

        agentie3.stergeNod(filiala4);
        agentie1.adaugaNod(filiala4);
        agentie1.stergeNod(agentie3);


        System.out.println();
        System.out.println();
        agentie1.afiseazaDescriere();
        System.out.println();
        agentie2.afiseazaDescriere();
    }
}
