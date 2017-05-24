import generator.PrimeGenerator;

import java.util.List;
import java.util.Scanner;

/**
 * Created by zmans on 5/18/2017.
 */
public class Generator {

    private static int verifyInput(Scanner sc){
        int num = 0;
        String firstNum = sc.next();
        boolean numeric = false;
        while(!numeric){
            try{
                num = Integer.parseInt(firstNum);
                numeric = true;
            } catch (Exception e){
                System.out.println("Input invalid, please enter an integer");
                firstNum = sc.next();
            }
        }
        return num;
    }

    private static void printPrimes(List<Integer> primes, int firstInt, int secInt){
        System.out.println("The range is: [" + firstInt + ", " + secInt + "]");
        System.out.println("Your Primes Are:");
        int i = 1;
        for(Integer prime : primes){
            if(i++ != primes.size()){
                System.out.print(prime + ", ");
                if(i%25 == 0){
                    //This simply adds a "\n" so that the print out is more readable
                    System.out.println();
                }
            }else{
                System.out.println(prime);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int firstInt = verifyInput(sc);
        System.out.println("Please enter the second integer");
        int secInt = verifyInput(sc);

        PrimeGenerator primeGenerator = new PrimeGenerator();
        printPrimes(primeGenerator.generate(firstInt, secInt), firstInt, secInt);

        System.out.println("Would you like to generate another range of primes?: Y/N");
        String cin = sc.next();
        while(!cin.equals("N") && !cin.equals("n")){
            if(cin.equals("Y") || cin.equals("y")){
                System.out.println("Please enter the first integer");
                firstInt = sc.nextInt();
                System.out.println("Please enter the second integer");
                secInt = sc.nextInt();
                printPrimes(primeGenerator.generate(firstInt, secInt), firstInt, secInt);
            }else{
                System.out.println("Invalid Input: Please Enter only 'Y' or 'N'");
            }
            System.out.println("Would you like to generate another range of primes?: Y/N");
            cin = sc.next();
        }
    }
}
