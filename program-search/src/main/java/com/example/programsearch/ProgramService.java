package com.example.programsearch;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


@Service
public class ProgramService {
    private static final Map<String, String> _programs_ = new HashMap<>();

    static {
        // Initialize with some programs
        _programs_.put("Fibonacci", "import java.util.Scanner;\n" +
                "\n" +
                "public class Fibonacci {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter the number of terms in Fibonacci series: \");\n" +
                "        int n = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        System.out.println(\"Fibonacci Series up to \" + n + \" terms:\");\n" +
                "        int first = 0, second = 1;\n" +
                "        for (int i = 0; i < n; i++) {\n" +
                "            System.out.print(first + \" \");\n" +
                "            int sum = first + second;\n" +
                "            first = second;\n" +
                "            second = sum;\n" +
                "        }\n" +
                "    }\n" +
                "}\n");

        _programs_.put("PrimeNumbers", "public class PrimeNumbers {\n" +
                "    public static void main(String[] args) {\n" +
                "        int n = 100;\n" +
                "        System.out.println(\"Prime numbers up to \" + n + \":\");\n" +
                "        for (int i = 2; i <= n; i++) {\n" +
                "            if (isPrime(i)) {\n" +
                "                System.out.print(i + \" \");\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static boolean isPrime(int num) {\n" +
                "        if (num <= 1) {\n" +
                "            return false;\n" +
                "        }\n" +
                "        for (int i = 2; i <= Math.sqrt(num); i++) {\n" +
                "            if (num % i == 0) {\n" +
                "                return false;\n" +
                "            }\n" +
                "        }\n" +
                "        return true;\n" +
                "    }\n" +
                "}\n");

        _programs_.put("Factorial", "import java.util.Scanner;\n" +
                "\n" +
                "public class Factorial {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a number to find its factorial: \");\n" +
                "        int n = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        System.out.println(\"Factorial of \" + n + \" is: \" + factorial(n));\n" +
                "    }\n" +
                "    \n" +
                "    public static int factorial(int n) {\n" +
                "        if (n == 0) {\n" +
                "            return 1;\n" +
                "        }\n" +
                "        return n * factorial(n - 1);\n" +
                "    }\n" +
                "}\n");

        _programs_.put("Palindrome", "import java.util.Scanner;\n" +
                "\n" +
                "public class Palindrome {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a string to check if it's a palindrome: \");\n" +
                "        String str = scanner.nextLine();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        if (isPalindrome(str)) {\n" +
                "            System.out.println(str + \" is a palindrome.\");\n" +
                "        } else {\n" +
                "            System.out.println(str + \" is not a palindrome.\");\n" +
                "        }\n" +
                "    }\n" +
                "    \n" +
                "    public static boolean isPalindrome(String str) {\n" +
                "        int left = 0, right = str.length() - 1;\n" +
                "        while (left < right) {\n" +
                "            if (str.charAt(left++) != str.charAt(right--)) {\n" +
                "                return false;\n" +
                "            }\n" +
                "        }\n" +
                "        return true;\n" +
                "    }\n" +
                "}\n");

        _programs_.put("ArmstrongNumber", "import java.util.Scanner;\n" +
                "\n" +
                "public class ArmstrongNumber {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a number to check if it's an Armstrong number: \");\n" +
                "        int number = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        if (isArmstrong(number)) {\n" +
                "            System.out.println(number + \" is an Armstrong number.\");\n" +
                "        } else {\n" +
                "            System.out.println(number + \" is not an Armstrong number.\");\n" +
                "        }\n" +
                "    }\n" +
                "    \n" +
                "    public static boolean isArmstrong(int number) {\n" +
                "        int originalNumber, remainder, result = 0, n = 0;\n" +
                "        originalNumber = number;\n" +
                "        while (originalNumber != 0) {\n" +
                "            originalNumber /= 10;\n" +
                "            ++n;\n" +
                "        }\n" +
                "        originalNumber = number;\n" +
                "        while (originalNumber != 0) {\n" +
                "            remainder = originalNumber % 10;\n" +
                "            result += Math.pow(remainder, n);\n" +
                "            originalNumber /= 10;\n" +
                "        }\n" +
                "        return result == number;\n" +
                "    }\n" +
                "}\n");

        _programs_.put("SumOfDigits", "import java.util.Scanner;\n" +
                "\n" +
                "public class SumOfDigits {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a number to find its sum of digits: \");\n" +
                "        int number = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        int sum = 0;\n" +
                "        while (number != 0) {\n" +
                "            sum += number % 10;\n" +
                "            number /= 10;\n" +
                "        }\n" +
                "        System.out.println(\"Sum of digits: \" + sum);\n" +
                "    }\n" +
                "}\n");

        _programs_.put("ReverseNumber", "import java.util.Scanner;\n" +
                "\n" +
                "public class ReverseNumber {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a number to reverse it: \");\n" +
                "        int number = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        int reversedNumber = 0;\n" +
                "        while (number != 0) {\n" +
                "            int digit = number % 10;\n" +
                "            reversedNumber = reversedNumber * 10 + digit;\n" +
                "            number /= 10;\n" +
                "        }\n" +
                "        System.out.println(\"Reversed number: \" + reversedNumber);\n" +
                "    }\n" +
                "}\n");

        _programs_.put("SumOfNaturalNumbers", "import java.util.Scanner;\n" +
                "\n" +
                "public class SumOfNaturalNumbers {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a number to find the sum of first N natural numbers: \");\n" +
                "        int n = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        int sum = (n * (n + 1)) / 2;\n" +
                "        System.out.println(\"Sum of first \" + n + \" natural numbers: \" + sum);\n" +
                "    }\n" +
                "}\n");

        _programs_.put("LeapYear", "import java.util.Scanner;\n" +
                "\n" +
                "public class LeapYear {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a year to check if it's a leap year: \");\n" +
                "        int year = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        boolean isLeapYear = false;\n" +
                "        if (year % 400 == 0) {\n" +
                "            isLeapYear = true;\n" +
                "        } else if (year % 100 == 0) {\n" +
                "            isLeapYear = false;\n" +
                "        } else if (year % 4 == 0) {\n" +
                "            isLeapYear = true;\n" +
                "        }\n" +
                "        \n" +
                "        if (isLeapYear) {\n" +
                "            System.out.println(year + \" is a leap year.\");\n" +
                "        } else {\n" +
                "            System.out.println(year + \" is not a leap year.\");\n" +
                "        }\n" +
                "    }\n" +
                "}\n");

        _programs_.put("BinaryToDecimal", "import java.util.Scanner;\n" +
                "\n" +
                "public class BinaryToDecimal {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a binary number: \");\n" +
                "        String binaryString = scanner.nextLine();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        int decimal = Integer.parseInt(binaryString, 2);\n" +
                "        System.out.println(\"Decimal equivalent: \" + decimal);\n" +
                "    }\n" +
                "}\n");

        _programs_.put("DecimalToBinary", "import java.util.Scanner;\n" +
                "\n" +
                "public class DecimalToBinary {\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a decimal number: \");\n" +
                "        int decimal = scanner.nextInt();\n" +
                "        scanner.close();\n" +
                "        \n" +
                "        String binary = Integer.toBinaryString(decimal);\n" +
                "        System.out.println(\"Binary equivalent: \" + binary);\n" +
                "    }\n" +
                "}\n");
    }

    public String getProgramCode(String name) {
        String code = _programs_.get(name);
        if (code != null) {
            return code;
        } else {
            throw new NoSuchElementException("Program not found: " + name);
        }
    }
}