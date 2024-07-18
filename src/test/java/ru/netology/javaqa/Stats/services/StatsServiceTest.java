package ru.netology.javaqa.Stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
// сумму всех продаж;
    public void summaYear() {
        StatsService service = new StatsService();

        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumYear(sum);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    //среднюю сумму продаж в месяц;
    public void averageAmountTest() {
        StatsService service = new StatsService();

        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.averageAmount(sum);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test

    //номер месяца, в котором был пик продаж, то есть осуществлены
    // продажи на максимальную сумму*
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualmonth = service.maxSalesMonth(month);

        Assertions.assertEquals(expectedMonth, actualmonth);

    }

    @Test

    //номер месяца, в котором был минимум продаж,
    // то есть осуществлены продажи на минимальную сумму*;
    public void minSalesMonthTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSalesMonth(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    //количество месяцев,
    // в которых продажи были ниже среднего (см. п.2);
    public void numMonthMinAmountTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAmount = 5;
        long actualMinAmount = service.numMonthMinAmount(month);

        Assertions.assertEquals(expectedMinAmount, actualMinAmount);

    }

    @Test
    //количество месяцев, в которых продажи были выше среднего
    public void numMonthMaxAmountTest() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAmount = 5;
        long actualMaxAmount = service.numMonthMaxAmount(month);

        Assertions.assertEquals(expectedMaxAmount, actualMaxAmount);


    }
}

