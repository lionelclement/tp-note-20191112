package fr.ubordeaux.ao.infrastructure.inmemory;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.ubordeaux.ao.domain.exception.EntryException;
import fr.ubordeaux.ao.domain.model.Article;
import fr.ubordeaux.ao.domain.model.Category;
import fr.ubordeaux.ao.domain.model.Entry;
import fr.ubordeaux.ao.infrastructure.inmemory.DictionaryRepositoryInMemory;

public class DictionaryRepositoryTest {

	@Test
	public void entryShouldBeFound() {
		String form = "manger";
		String pronunciation = "mɑ̃ʒe";
		Category category = new Category("VERB");

		List<Article> articles = new ArrayList<Article>();

		String definition1 = "Mâcher et avaler un aliment dans le but de se nourrir. ";
		String usage1 = "(intr ou tr)";
		List<String> examples1 = new ArrayList<String>();
		examples1.add(
				"Mangez donc, lui dit la jeune fille en lui servant un morceau de la hure d’un sanglier. — (Alexandre Dumas, Othon l’archer, 1839)");
		
		Article article1 = new Article(definition1, usage1, examples1);

		String definition2 = "Prendre un repas";
		String usage2 = "(intr)";
		List<String> examples2 = new ArrayList<String>();
		examples2.add(
				"Ils mangent et boivent, font ripaille, remuent leurs membres, embrassent les filles, sonnent les cloches, s’emplissent de bruit : rudes bacchanales où l’homme se débride, et qui sont la consécration de la vie naturelle : les puritains ne s’y sont pas trompés. — (Hippolyte Taine, Histoire de la littérature anglaise, volume 1, 1856, page 255)");
		
		Article article2 = new Article(definition2, usage2, examples2);

		articles.add(article1);
		articles.add(article2);

		try {
			Entry entry = new Entry(form, pronunciation, category, articles);
			DictionaryRepositoryInMemory dictionary = new DictionaryRepositoryInMemory();
			dictionary.addEntry(entry);
			// On devrait retrouver cette entrée !!!
			assertEquals(dictionary.getEntry("manger"), entry);
		} catch (EntryException e) {
			e.printStackTrace();
		}

	}

}
