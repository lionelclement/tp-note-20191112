package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArticleTest {
	
	@Test
    public void articleShouldBeEquals() {
        String definition1 = "Prendre un repas"; 
        String usage1 = "";
        List<String> examples1 = new ArrayList<String>();
   
        Article article1 = new Article(definition1, usage1, examples1);

        String definition2 = "Prendre un repas"; 
        String usage2 = "";
        List<String> examples2 = new ArrayList<String>();
   
        Article article2 = new Article(definition2, usage2, examples2);
        
        assertEquals(article1, article2);
        

	}


}
