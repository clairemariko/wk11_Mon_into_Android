package example.codeclan.com.hellofrog;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 25/04/2016.
 */
public class AmphibianTest {
    @Test
    public void testFrogName(){
        Amphibian amphibian = new Amphibian("Kermit", "Bull Frog", "kiss me kiss me I want to be human");
        assertEquals("Kermit", amphibian.getName());
        assertEquals("Bull Frog", amphibian.getSpecies());
        assertEquals("kiss me kiss me I want to be human", amphibian.getGreeting());
    }





}
