package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static List<Aplicant> citesteAplicanti( IReader readAplicants) throws FileNotFoundException{
		return readAplicants.readAplicants();
	}


	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
