package org.example;

public class StringLengthCalculator {
    public int calculateLength(String inputString) {
        if (inputString == null) {
            return 0; // Return 0 for null input
        }
        return inputString.length();
    }

    public static void main(String[] args) {
        StringLengthCalculator calculateLength = new StringLengthCalculator();

        String input1 = "Hello, World!";
        int length1 = calculateLength.calculateLength(input1);
        System.out.println("Length of \"" + input1 + "\" is: " + length1);

        String input2 = null;
        int length2 = calculateLength.calculateLength(input2);
        System.out.println("Length of null string is: " + length2);
    }
}
