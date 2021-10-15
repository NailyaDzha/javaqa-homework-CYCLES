package ru.netology.sqr;

public class SQRService {
    public int SquareRootAmount(int start, int finish) {

        int squareRootAmount = 0;
        for (int i = 10; i <= 99; i++) {
            int squareRoot = i * i;
            if (squareRoot >= start && squareRoot <= finish) {
                squareRootAmount++;}

        }
        return squareRootAmount;
    }
}
