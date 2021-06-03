package Seminar14.teste.mocks;

import Seminar14.teste.TesteGrupaMock;
import Seminar14.teste.categorie.GetPromovabilitateCategory;
import Seminar14.teste.categorie.TesteUrgente;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses(TesteGrupaMock.class)
//@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {
}
