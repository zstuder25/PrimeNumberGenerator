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
        assertFalse(primeGenerator.isPrime(-1));
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
    public void getFirst26Primes(){
        List<Integer> primes = primeGenerator.generate(1, 102);
        assertEquals(primes.size(), 26);
        assertEquals(primes.get(20), new Integer(73));
        assertEquals(primes.get(15), new Integer(53));
        assertEquals(primes.get(9), new Integer(29));
        assertEquals(primes.get(0), new Integer(2));
    }

    @Test
    public void getFirst26PrimesWithNegativeRange(){
        List<Integer> primes = primeGenerator.generate(-500, 102);
        assertEquals(primes.size(), 26);
        assertEquals(primes.get(20), new Integer(73));
        assertEquals(primes.get(15), new Integer(53));
        assertEquals(primes.get(9), new Integer(29));
        assertEquals(primes.get(0), new Integer(2));
    }

    @Test
    public void getPrimesWithReverseNumbers(){
        List<Integer> primes = primeGenerator.generate(102, 1);
        assertEquals(primes.size(), 26);
        assertEquals(primes.get(20), new Integer(73));
        assertEquals(primes.get(15), new Integer(53));
        assertEquals(primes.get(9), new Integer(29));
        assertEquals(primes.get(0), new Integer(2));
    }

    @Test
    public void getLargePrimes(){
        List<Integer> primes = primeGenerator.generate(7900, 7920);
        assertEquals(primes.size(), 3);
        assertEquals(primes.get(0), new Integer(7901));
        assertEquals(primes.get(1), new Integer(7907));
        assertEquals(primes.get(2), new Integer(7919));
    }

    @Test
    public void getLotsOfPrimes(){
        List<Integer> primes = primeGenerator.generate(2, 7920);
        assertEquals(primes.size(), 1000);
        assertEquals(primes.get(primes.size()-1), new Integer(7919));
    }

    @Test
    public void getLotsOfPrimesReverse(){
        List<Integer> primes = primeGenerator.generate(7920, 2);
        assertEquals(primes.size(), 1000);
        assertEquals(primes.get(primes.size()-1), new Integer(7919));
    }
}
