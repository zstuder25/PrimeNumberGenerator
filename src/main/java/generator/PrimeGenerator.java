package generator;

import interfaces.PrimeNumberGenerator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zmans on 5/18/2017.
 */
public class PrimeGenerator implements PrimeNumberGenerator {


    public boolean isPrime(int value){
        if(value > -2 && value < 2){
            return false;
        }
        for(int i = 2; i < value; i++){
            if(value%i == 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> generate(int startingValue, int endingValue){
        List<Integer> primes = new LinkedList<>();
        for(int i = startingValue; i < endingValue; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args){
        
    }
}
