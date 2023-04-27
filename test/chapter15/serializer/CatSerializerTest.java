package chapter15.serializer;

import chapter15.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class CatSerializerTest {
    private final LocalDateTime localDateTime = LocalDateTime.now().minusYears(20);
    private DateTimeFormatter dateTimeFormatter;
    Cat cat;
@BeforeEach
public void setUp(){
    dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    cat = new Cat();
    cat.setAge(20);
    cat.setName("cat");
    cat.setLocalDateTime(localDateTime);

}
@Test
    public void testConvertCatJson() {
    String catJson = CatSerializer.convertCatToJson(cat);
    System.out.println(catJson);
    assertNotNull(catJson);
    assertEquals("{\"name\":\"cat\",\"age\":20,\"localDateTime\":"+"\""+dateTimeFormatter.format(localDateTime)+"\"}", catJson);
}
}
