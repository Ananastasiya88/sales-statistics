package ru.netology.stats;

public class StatsService {

    public int sum(int[] items) {
        int result = 0;
        for (int item : items) {
            result += item;
        }
        return result;
    }

    public int avg(int[] items) {
        return sum(items) / items.length;
    }

    public int monthWithMax(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (item > max) {
                max = item;
            }
        }
        int monthCount = 0;
        int monthWithMax = 0;
        for (int item : items) {
            monthCount++;
            if (item == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }

    public int monthWithMin(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (item < min) {
                min = item;
            }
        }
        int monthCount = 0;
        int monthWithMin = 0;
        for (int item : items) {
            monthCount++;
            if (item == min) {
                monthWithMin = monthCount;
            }
        }
        return monthWithMin;
    }

    public int monthsWithMoreThanAvg(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthsWithLessThanAvg(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if (item < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
