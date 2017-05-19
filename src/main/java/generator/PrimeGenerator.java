package generator;

import interfaces.PrimeNumberGenerator;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by zmans on 5/18/2017.
 */
public class PrimeGenerator implements PrimeNumberGenerator {

    /**
     * isPrime function used to determine if a given number is prime or not
     * @param value
     *      the number to be evaluated
     * @return
     *      boolean if the number is prime or not
     */
    public boolean isPrime(int value){
        //Even numbers are instantly discarded, thus increasing performance (along with negative numbers, 0, and 1)
        if(value < 2 || (value % 2 == 0 && value !=2)){
            return false;
        }
        for(int i = 3; i < value; i+=2){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * generate function to return a list of prime numbers between a set of arbitrary values
     * @param startingValue
     *      the first index of the set of values
     * @param endingValue
     *      the second index of the set of values
     * @return
     *      a list of primes (inclusive) between the least of the two values to the greatest
     */
    public List<Integer> generate(int startingValue, int endingValue){
        int lowVal = (startingValue < endingValue) ? startingValue : endingValue;
        int highVal = (lowVal == startingValue) ? endingValue : startingValue;
        List<Integer> primes = new LinkedList<>();
        for(int i = lowVal; i < highVal; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
}
