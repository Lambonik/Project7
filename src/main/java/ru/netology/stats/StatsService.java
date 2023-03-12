package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int getSumSales(int[] sales) {
        int sumSales = 0;

        for (int i : sales) {
            sumSales = sumSales + i;
        }
        return sumSales;
    }

    public int getAvgSumSales(int[] sales) {
        int count = 0;

        for (int i : sales) {
            count = count + 1;
        }
        return getSumSales(sales) / count;
    }

    public int getMonthMaxSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getCountMonthUnderAvgSales(int[] sales) {
        int countMonth = 0;

        for (int i : sales) {
            if (i > getAvgSumSales(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    public int getCountMonthUpperAvgSales(int[] sales) {
        int countMonth = 0;

        for (int i : sales) {
            if (i < getAvgSumSales(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }
}
