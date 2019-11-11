// cite: (https://fr.wiktionary.org/wiki/manger)

package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.ubordeaux.ao.domain.exception.EntryException;
import fr.ubordeaux.ao.domain.model.Article;
import fr.ubordeaux.ao.domain.model.Category;
import fr.ubordeaux.ao.domain.model.Entry;

public class EntryTest {

	@Test
	public void categoriesShouldBeEqual() {
		Category category = new Category("VERB");
		assertEquals(new Category("VERB"), category);
	}

	@Test
	public void formShouldNotNull() {
		try {
			String pronunciation = "mɑ̃ʒe";
			Category category = new Category("VERB");

			List<Article> articles = new ArrayList<Article>();

			String definition1 = "Mâcher et avaler un aliment dans le but de se nourrir. ";
			String usage1 = "(intr ou tr)";
			List<String> examples1 = new ArrayList<String>();
			examples1.add(
					"Mangez donc, lui dit la jeune fille en lui servant un morceau de la hure d’un sanglier. — (Alexandre Dumas, Othon l’archer, 1839)");

			Article article1 = new Article(definition1, usage1, examples1);

			articles.add(article1);

			new Entry(null, pronunciation, category, articles);

			fail("should not create questionnary with null form ");
		} catch (EntryException ex) {
		}
	}

	@Test
	public void encapsulationShouldBePreserved() {
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

		Entry entry;
		try {
			entry = new Entry(form, pronunciation, category, articles);
			Entry entryCopy = new Entry(form, pronunciation, category, articles);
			entryCopy.getArticles().clear();
			// Il doit y avoir deux articles bien qu'on ait effacé les articles de la copie
			assertEquals(2, entry.getArticles().size());

		} catch (EntryException e) {
			e.printStackTrace();
		}
	}

}
