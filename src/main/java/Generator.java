import generator.PrimeGenerator;

import java.util.List;
import java.util.Scanner;

/**
 * Created by zmans on 5/18/2017.
 */
public class Generator {

    private static void printPrimes(List<Integer> primes){
        System.out.println("Your Primes Are:");
        int i = 1;
        for(Integer prime : primes){
            if(i++ != primes.size()){
                System.out.print(prime + ", ");
            }else{
                System.out.println(prime);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int firstInt = sc.nextInt();
        System.out.println("Please enter the second integer");
        int secInt = sc.nextInt();

        PrimeGenerator primeGenerator = new PrimeGenerator();
        printPrimes(primeGenerator.generate(firstInt, secInt));

        System.out.println("Would you like to generate another range of primes?: Y/N");
        String cin = sc.next();
        while(!cin.equals("N") && !cin.equals("n")){
            if(cin.equals("Y") || cin.equals("y")){
                System.out.println("Please enter the first integer");
                firstInt = sc.nextInt();
                System.out.println("Please enter the second integer");
                secInt = sc.nextInt();
                printPrimes(primeGenerator.generate(firstInt, secInt));
            }else{
                System.out.println("Invalid Input: Please Enter only 'Y' or 'N'");
            }
            System.out.println("Would you like to generate another range of primes?: Y/N");
            cin = sc.next();
        }
    }
}
