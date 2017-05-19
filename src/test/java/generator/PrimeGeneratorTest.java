package generator;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by zmans on 5/18/2017.
 */
public class PrimeGeneratorTest {

    public PrimeGenerator primeGenerator;

    @Before
    public void setup(){
        primeGenerator = new PrimeGenerator();
    }

    @Test
    public void easyPrimeNumberTest(){
        assertFalse(primeGenerator.isPrime(0));
        assertFalse(primeGenerator.isPrime(1));
        assertTrue(primeGenerator.isPrime(2));
        assertTrue(primeGenerator.isPrime(3));
    }

    @Test
    public void largePrimeTest(){
        assertTrue(primeGenerator.isPrime(7901));
        assertFalse(primeGenerator.isPrime(7902));
        assertTrue(primeGenerator.isPrime(7907));
        assertTrue(primeGenerator.isPrime(7919));
    }

    @Test
    public void negativePrimeTest(){
        assertFalse(primeGenerator.isPrime(-1));
        assertTrue(primeGenerator.isPrime(-2));
        assertTrue(primeGenerator.isPrime(-3));
        assertFalse(primeGenerator.isPrime(-4));
    }

    @Test
    public void getFirst26Primes(){
        List<Integer> primes = primeGenerator.generate(1, 102);
        assertEquals(primes.size(), 26);
//        assertEquals(primes.get(20), 73);
    }
}
