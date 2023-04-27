package tdd;

import Practice.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntryTest {
    private Entry entry;
    @BeforeEach
    public void entry(){
        entry = new Entry(",7555","khfik");
    }
    @Test
    public void titleTest(){
        entry.setTitle("TodoList");
        assertEquals("TodoList",entry.getTitle());
    }
    @Test
    public void id(){
        entry.id(7555);
        assertEquals(7555,entry.getId());
    }
@Test
    public void bodyOfDairyTest(){
        assertEquals("the boy",entry.getBody());
}

//@Test
//public void dateAndTimeTest(){
//        entry.getDateAndtime();
//        assertEquals(entry.getDateAndtime(),entry.getDateAndtime());
//}

}
