package fr.ubordeaux.ao.domain.model;

import java.util.List;

public class Article {
	
	private String id;
	private static int nextId;
	private String definition;
	private String usage;
	private List<String> examples;
	
	public Article(String definition, String usage, List<String> examples) {
		super();
		this.id = String.valueOf(nextId++);
		this.definition = definition;
		this.usage = usage;
		this.examples = examples;
	}
	
	public Article(String id, String definition, String usage, List<String> examples) {
		this(definition, usage, examples);
		this.id = id;
	}
	
	public Article clone() {
		return new Article (this.id, this.definition, this.usage, this.examples);
	}

	public String toString() {
		return definition + '(' + super.toString() + ')';
	}

}
