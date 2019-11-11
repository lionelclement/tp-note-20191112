package fr.ubordeaux.ao.domain.model;

public class Category {

	private final String arg;

	public Category(String arg) {
		switch (arg) {
		case "VERB":
		case "NOUN":
		case "ADJECTIVE":
		case "PREPOSITION":
		case "CONJUNCTION":
			break;
		default:
			throw new IllegalArgumentException();
		}
			this.arg = arg;
	}

	public String toString() {
		return arg + '(' + super.toString() + ')';
	}

}
