package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
    
    /*
    @Test
    public void canConstructAPersonWithAName2() {
        Person person = new Person("Larry");
        assertEquals("Antonio", person.getName());
    }
    */
    
}
