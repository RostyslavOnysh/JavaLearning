package palindromeChecker;

import java.util.Scanner;

public class palCheckMethodWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int acceptedNumb = sc.nextInt();
        int reverseNum = 0;
        int initialNum = acceptedNumb;
        int remainder =0;
        while (acceptedNumb!=0){
            remainder = acceptedNumb%10;
            reverseNum = (reverseNum*10)+remainder;
            acceptedNumb = acceptedNumb /10;
        }
        if (initialNum == reverseNum){
            System.out.println("Yes, the given number " + initialNum + " is a palindrome.");
        }else {
            System.out.println("No, the given number " + initialNum + " is not a palindrome.");
        }
    }
}
