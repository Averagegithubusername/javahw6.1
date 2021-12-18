package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sumAll = 0;
        for (long sale : sales) {
            sumAll += sale;
        }
        return sumAll;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAvgSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                count++;
            }

        }
        return count;
    }

    public int aboveAvgSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                count++;
            }

        }
        return count;
    }
}