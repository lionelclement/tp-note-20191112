package fr.ubordeaux.ao.domain.model;

public interface DictionaryRepository {
	
	    void addEntry(Entry entry);
	    void loadDictionnary(String fileName);


}
