package interfaces;

import java.util.List;

/**
 * Created by zmans on 5/18/2017.
 */
public interface PrimeNumberGenerator {
    List<Integer> generate(int startingValue, int endingValue);

    boolean isPrime(int value);
}
