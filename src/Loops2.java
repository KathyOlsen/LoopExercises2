import java.util.Scanner;

public class Loops2 {

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static String repeat(int count) {
        return repeat(count, "-");
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //print the cube of all numbers up to the input number
        System.out.println("Please enter a number greater than zero: ");
        int num = key.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("The cube of " + i + " is " + Math.pow(i, 3));
        }
        System.out.println();

        //Print multiplication table to 10 for input number
        System.out.println("Please enter a number greater than zero: ");
        int num2 = key.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num2 + " = " + (i * num2));
        }
        System.out.println();

        //print odd numbers up to input number and their sum
        System.out.println("Please enter a number greater than zero: ");
        int num3 = key.nextInt();
        int sum = 0;
        System.out.println("The odd numbers from 1 to " + num3 + " are: ");
        for (int i = 1; i <= num3; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of those numbers is: " + sum);

        //print even numbers up to input number and their sum
        System.out.println("Please enter a number greater than zero: ");
        int num4 = key.nextInt();
        int sum2 = 0;
        System.out.println("The even numbers from 1 to " + num4 + " are: ");
        for (int i = 2; i <= num4; i += 2) {
            System.out.println(i);
            sum2 += i;
        }
        System.out.println("The sum of those numbers is: " + sum2);

        //print 5 rows: 1,12,123,1234,12345
        String result = "";
        for (int i = 1; i <= 5; i++) {
            result += i;
            System.out.println(result);
        }
        System.out.println();

        //print 5 rows: 1,22,333,4444,55555
        String result2 = "";
        for (int i = 1; i <= 5; i++) {
            result2 += i;
            System.out.println(repeat(i, result2));
            result2 = "";
        }

        //print 5 rows: 1,2 3,4 5 6,7 8 9 10
        String result3 = "";
        for (int i = 1; i <= 10; i++) {
            result3 += i;
            result3 += " ";
            if (i == 1 | i == 3 | i == 6 | i == 10) {
                System.out.println(result3);
                result3 = "";
            } else {
            }
        }
        System.out.println();

        //print 5 rows: 1,01,101,0101,10101
        String result4 = "";
        int b = 0;
        for (int i = 1; i <= 15; i++) {
            int rem = i % 2;
            if (rem == 0) {
                b = 0;
            } else {
                b = 1;
            }
            result4 += b;
            if (i == 1 | i == 3 | i == 6 | i == 10 | i == 15) {
                System.out.println(result4);
                result4 = "";
            } else {
            }
        }
        System.out.println();

        //print whether an input number is a palindrome
        System.out.println(" Please enter a number from 1 to 999: ");
        String num5 = key.next();
        int lenNum5 = num5.length();
        for (int i = 0; i < lenNum5; i++) {
            if (num5.charAt(i) != num5.charAt((lenNum5 - (i + 1)))) {
                System.out.println(num5 + " is not a palindrome");
                break;
            } else if (i == (lenNum5 - 1)) {
                System.out.println(num5 + " is a palindrome");
            }
        }

        //print the sum of all integers 100-200 that are divisible by 9


    }
}
