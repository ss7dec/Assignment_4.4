////Assignment 4.4

//Write a program to find the aliquot sum of a given number.
//Hint: The aliquot divisors of a number are all its divisors 
// except the number itself. The aliquot sum is the sum of the 
//aliquot divisors. For example, the aliquot divisors of 12 are 
//1, 2, 3, 4, and6 and its aliquot sum is 16. Extend this program 
//to check if given number is a perfect number or not. If a number
//equals to its aliquot sum, then it is a perfect number. Print 
//all perfect numbers between 1 to 100.

package assignment_4_4;

public class Perfect {
	public static void main(String[] args) {
        final int LIMIT = 100;
        boolean isPerfect = false;
        int i;
        for(i = 2; i < LIMIT; i++) { 
            isPerfect = isNumPerfect(i);
            if(isPerfect) {
                System.out.println(i + " is a perfect number");
            }
        }
    }
    public static boolean isNumPerfect(int i) {
        boolean isPerfect = false;
        int sum = 1;
        int x;
        for(x = 2; x <= i / 2; x++) {
            if(i % x == 0) {
                sum += x;
            }
        }
        if(sum == i) {
            isPerfect = true;
        }
        return isPerfect;
    }
}

//Perfect number: In number system, a perfect number is a positive integer that is equal to the sum of its proper positive divisors,
//that is, the sum of its positive divisors excluding the number itself.
//Equivalently, a perfect number is a number that is half the sum of all of its positive divisors (including itself) i.e. σ1(n) = 2n.
//The first perfect number is 6. Its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal
//to half the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6. The next perfect number is 28 = 1 + 2 + 4 + 7 + 14. 
//This is followed by the perfect numbers 496 and 8128.
