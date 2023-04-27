package chapter15.deserializer;

import chapter15.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.*;

public class DeSerializerTest {
private String catJson;
private DateTimeFormatter formatter;
private final LocalDateTime localDateTime = LocalDateTime.now().minusYears(20);
@BeforeEach
    public void setUp(){
    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    catJson ="{\"name\":\"cat\",\"age\":20,\"birthday\":"+ "\"" + formatter.format(localDateTime)+ "\""+"}";
}
@Test
    public void deserializeJsonToCat(){
    Cat ologbo = CatDeserializer.deserializeJsonToCat(catJson);
    assertNotNull(ologbo);
    System.out.println(ologbo);
    assertEquals("cat",ologbo.getName());
    assertEquals(formatter.format(localDateTime),formatter.format(ologbo.getLocalDateTime()));

}
}
