package fr.ubordeaux.ao.domain.model;

import java.util.List;

public class Dictionary {
	
	private List<Entry> entries;
	
	public Dictionary(List<Entry> entries) {
		this.entries = entries;
	}

	public void addEntry(Entry entry) {
		entries.add(entry);
	}

}
