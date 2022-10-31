package palindromeChecker;

import java.util.Scanner;

public class palCheckMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int acceptedNumb = sc.nextInt();

        int reverseNum = 0;
        int initialNum = acceptedNumb;
        int remainder =0;
        for (;acceptedNumb!=0; acceptedNumb/=10){
            remainder = acceptedNumb%10;
            reverseNum = (reverseNum*10)+remainder;
        }
        if (initialNum==reverseNum){
            System.out.println("Yes, the given number : "+ initialNum
            + "is a palindrome");
        }else {
            System.out.println("no, the given number : "+initialNum
            +" is not a palindrome");
        }
    }
}
