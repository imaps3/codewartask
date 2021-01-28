package com.games;

public class Main {

    public static void main(String[] args) {
	int numOfBits = countBits(1234);
        System.out.println("Number has: "+ numOfBits + " bits");
    }
    public static int countBits(int n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
        }
    public static int squareDigits(int n) {

        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }
}
