package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200, 300, 3",
            "400, 500, 3"})
    void shouldDisplaySquareRootAmount(int start, int finish, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareRootAmount( start, finish);
        assertEquals(expected, actual);
    }
}