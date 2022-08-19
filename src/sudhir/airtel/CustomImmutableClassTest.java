package sudhir.airtel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomImmutableClassTest {

    CustomImmutableClass customImmutableClass;
    private Integer id = 123;
    private String title = "Sudhir";
    private String key  = "title";
    private String value = "Software Architect";

    Map<String, String> map = new HashMap<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        map.put(key, value);
        customImmutableClass = new CustomImmutableClass(id,title, map);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        customImmutableClass = null;
    }

    @org.junit.jupiter.api.Test
    void getId() {
        Assertions.assertTrue(customImmutableClass.getId().equals(id));
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
        assertTrue(customImmutableClass.getId().equals(id));
    }

    @org.junit.jupiter.api.Test
    void getMetaData() {
        int hashCode1 = this.customImmutableClass.getMetaData().hashCode();
        int hashCode2 = this.map.hashCode();
        assertTrue(customImmutableClass.getMetaData() != map);
    }
}