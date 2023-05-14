package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        int amount = 3150;
        int expected = 850;
        int actual = CashbackHackService.remain(amount);
        assertEquals(expected, actual);

    }

}