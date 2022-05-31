package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void squaresInRange() {
        SQRService service = new SQRService();

        int actual = service.countSquares(900);
        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void squaresBelowRange() {
        SQRService service = new SQRService();

        int actual = service.countSquares(-100);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void squaresAboveRange() {
        SQRService service = new SQRService();

        int actual = service.countSquares(1_000);
        int expected = 22;

        Assertions.assertEquals(expected, actual);

    }
}