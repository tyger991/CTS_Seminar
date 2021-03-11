package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class IReader {

     public String filePath;

     public IReader(String filePath) {
          this.filePath = filePath;
     }

     public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;

     public void citireAplicanti(Scanner input, Aplicant aplicant) {
          String nume = input.next();
          String prenume = input.next();
          int varsta = input.nextInt();
          int punctaj = input.nextInt();
          int nr = input.nextInt();
          String[] vect = new String[nr];
          for (int i = 0; i < nr; i++)
               vect[i] = input.next();

          aplicant.setNume(nume);
          aplicant.setPrenume(prenume);
          aplicant.setVarsta(varsta);
          aplicant.setPunctaj(punctaj);
          aplicant.setVectorDenumiri(vect, nr);

     }

}
