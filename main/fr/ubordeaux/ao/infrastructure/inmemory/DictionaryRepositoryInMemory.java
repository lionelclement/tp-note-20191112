package fr.ubordeaux.ao.infrastructure.inmemory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.ubordeaux.ao.domain.exception.EntryException;
import fr.ubordeaux.ao.domain.model.Article;
import fr.ubordeaux.ao.domain.model.Category;
import fr.ubordeaux.ao.domain.model.Dictionary;
import fr.ubordeaux.ao.domain.model.DictionaryRepository;
import fr.ubordeaux.ao.domain.model.Entry;

public class DictionaryRepositoryInMemory implements DictionaryRepository {
	
	private Dictionary dictionary;
	private Map<String, Entry> map;

	
	public DictionaryRepositoryInMemory() {
		List<Entry> entries = new ArrayList<Entry>();
		map = new HashMap<String, Entry>();
		this.dictionary = new Dictionary(entries); 
	}
	
	@Override
	public void addEntry(Entry entry) {
		dictionary.addEntry(entry);
	}

	@Override
	public void loadDictionnary(String fileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String text;
			while ((text = reader.readLine()) != null) {
				String[] parts = text.split("\t");
				addEntry(new Entry(parts[0], parts[1], new Category(parts[2]), new ArrayList<Article>()));
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EntryException e) {
			e.printStackTrace();
		}
	 }

	public Entry getEntry(String key) {
		return map.get(key);
	}

}
