package sudhir.airtel;

import java.util.HashMap;
import java.util.Map;

/**
 * This is Immutable class:
 *
 * Immutable class definition:
 * The class must be declared as final so that child classes can&rsquo;t be created.
 * Data members in the class must be declared private so that direct access is not allowed.
 * Data members in the class must be declared as final so that we can&rsquo;t change the value of it after object creation.
 * A parameterized constructor should initialize all the fields performing a deep copy so that data members can&rsquo;t be modified with an object reference.
 * Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)
 */

public final class CustomImmutableClass {
    private final Integer id;
    private final String title;
    private final Map<String, String> metaData;


    public CustomImmutableClass(Integer id, String title, Map<String, String> metaData) {
        this.id = id;
        this.title = title;
        Map<String, String> tempMetaData = new HashMap<>();
        for (Map.Entry<String, String> entry: metaData.entrySet()){
            tempMetaData.put(entry.getKey(),entry.getValue());
        }
        this.metaData = tempMetaData;
    }
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Map<String, String> getMetaData() {
        Map<String, String > tempMetaData = new HashMap<>();
        for (Map.Entry<String, String> entry: metaData.entrySet()){
            tempMetaData.put(entry.getKey(), entry.getValue());
        }
        return tempMetaData;
    }

}
