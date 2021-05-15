package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author vivek g
 * generates random integer which can be sent to other consumer
 */
public class Randomizer
{
    private challenges.Primes primes;
    private static List<Integer> randomIntegers =new ArrayList<Integer>();

    public static void main(String[] args) {
        randomIntegers= generateRandom();
        findPrimes(randomIntegers);
    }

    private static List<Integer> generateRandom() {
        Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
            randomIntegers.add(objGenerator.nextInt(100));
        }
        return randomIntegers;
    }

    /**
     * @param integers
     * @return filtered primes
     */
    private static List<Integer> findPrimes(List<Integer> integers)
    {
        return null;
    }

}
