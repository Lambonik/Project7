package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int getSumSales(int[] sales) {

        return Arrays.stream(sales).sum();

    }

    public int getAvgSumSales(int[] sales) {

       return getSumSales(sales) / (int) Arrays.stream(sales).count();

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
        int avgSales = getSumSales(sales) / (int) Arrays.stream(sales).count();
        int countMonth = 0;

        for (int i : sales) {
            if (i > avgSales) {
                countMonth = countMonth+1;
            }
        }
        return countMonth;
    }
    public int getCountMonthUpperAvgSales(int[] sales) {
        int avgSales = getSumSales(sales) / (int) Arrays.stream(sales).count();
        int countMonth = 0;

        for (int i : sales) {
            if (i < avgSales) {
                countMonth = countMonth+1;
            }
        }
        return countMonth;
    }
}
