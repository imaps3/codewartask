package com.games;

public class Main {

    public static void main(String[] args) {
	int numOfBits = countBits(1234);
        
    }
    public static int countBits(int n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
        }
}
