package Practice;

import java.util.ArrayList;
import java.util.List;

    public class ebukaDairy {
        private boolean isLocked = true;
        private final String password;
        private final List<EbukaEntry> entries;

        public ebukaDairy(String ownersName, String password){
            this.password = password;
            entries = new ArrayList<>();

        }

        public boolean isLocked() {
            return isLocked;
        }

        public void unlockWith(String password) {
            if (password.equals(this.password))
                isLocked = false;
        }

        public void lock() {
            isLocked = true;
        }

        public void write(String title, String body) {
            //if (!isLocked) writeIntoDiary(title, body);
            if (isLocked) throw new IllegalArgumentException("You can't write in a locked diary");
            writeIntoDiary(title, body);
        }

        private void writeIntoDiary(String title, String body){
            int id = numberOfEntries() + 1;
            EbukaEntry newEntry = new EbukaEntry( id, title, body);
            entries.add(newEntry);
        }

        public int numberOfEntries() {
            return entries.size();
        }

        public EbukaEntry findEntryWithId(int id) {
            for (EbukaEntry entry: entries){
                if (entry.getId() == id)
                    return entry;
            }
        return entries.get(id-1);
            //return null;
        }

//    public void delete() {
  //      int id = numberOfHappenings()-1;
//}
    }


