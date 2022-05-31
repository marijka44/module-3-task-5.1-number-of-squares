package ru.netology.sqr;


public class SQRService {

    public int countSquares(int from, int to) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= from && square <= to) {
                count++;
            }
        }
        return count;
    }
}