package Practice;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private Entry newEntry;
    private final List<Entry> entries = new ArrayList<>();

    public String newEntry(String body, String title){
         newEntry = new Entry(title,body);
        entries.add(newEntry);
        return "Entry is saved "+title;
    }
public boolean deleteEntry(int id){
         return  entries.remove(entries);
    }

public int NumbersOfEntry(){
        return entries.size();
    }
public Entry ViewEntry(int idNumber){
        return (Entry) entries;

  }

}
