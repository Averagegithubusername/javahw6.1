package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCountSum() {
        StatsService sumService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = sumService.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountAvg() {
        StatsService avgService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = avgService.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMax() {
        StatsService maxService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = maxService.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMin() {
        StatsService minService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = minService.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountBelowAvg() {
        StatsService belowAvgService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = belowAvgService.belowAvgSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountAboveAvg() {
        StatsService aboveAvgService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = aboveAvgService.aboveAvgSales(sales);
        assertEquals(expected, actual);
    }

}