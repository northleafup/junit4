package top;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @create by northleaf on 2020-06-24
 */
public class PersonTest {


    private Person person;
    @Before
    public void setUp() throws Exception{
        person = new Person();
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("tear down invoke");
    }


    @Test
    public void testSay() throws Exception{
        assertEquals("Hello, lvan",person.say("lvan"));
    }

}
