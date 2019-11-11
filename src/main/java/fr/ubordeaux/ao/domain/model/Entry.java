package fr.ubordeaux.ao.domain.model;

import java.util.List;

import fr.ubordeaux.ao.domain.exception.EntryException;

public class Entry {
	
	private String form;
	private String pronunciation;
	private Category category;
	private List<Article> articles;

	public Entry(String form, String pronunciation, Category category, List<Article> articles) throws EntryException {
		super();
		this.form = form;
		this.pronunciation = pronunciation;
		this.category = category;
		this.articles = articles;
	}

	public String getForm() {
		return form;
	}

    public List<Article> getArticles() {
		return articles;
	}

	public Category getCategory() {
		return category;
	}

	
	public String toString() {
		String result;
		result = "Entry: " + form + ' ' + pronunciation + ' ' + category.toString();
		for (Article article : articles) {
			result += '\n' + article.toString();
		}
		return result;
	}

	
}
