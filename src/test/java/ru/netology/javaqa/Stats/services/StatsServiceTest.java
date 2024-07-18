package ru.netology.javaqa.Stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test

    public void summaYear() {
        StatsService service = new StatsService();

        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumYear(sum);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test

    public void averageAmountTest() {
        StatsService service = new StatsService();

        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageAmount(sum);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualmonth = service.maxSalesMonth(month);

        Assertions.assertEquals(expectedMonth, actualmonth);

    }

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSalesMonth(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void numMonthMinAmountTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAmount = 5;
        int actualMinAmount = service.numMonthMinAmount(month);

        Assertions.assertEquals(expectedMinAmount, actualMinAmount);

    }

    @Test
    public void numMonthMaxAmountTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAmount = 5;
        int actualMaxAmount = service.numMonthMaxAmount(month);

        Assertions.assertEquals(expectedMaxAmount, actualMaxAmount);


    }
}

