package ru.netology.javaqa.Stats.services;


public class StatsService {
    // сумму всех продаж;
    public long sumYear(long[] sales) {

        long salesAmount = 0;

        for (int month = 0; month < sales.length; month++) {
            salesAmount = (salesAmount + sales[month]);

        }
        return salesAmount;
    }

    //среднюю сумму продаж в месяц;
    public long averageAmount(long[] sales) {
        long averageSale = sumYear(sales) / 12; // Средняя сумма прожаж

        return averageSale;

    }

    //номер месяца, в котором был пик продаж, то есть осуществлены
    // продажи на максимальную сумму*
    public long maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // max месяц продаж
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж,
    // то есть осуществлены продажи на минимальную сумму*;
    public long minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {  // min месяц продаж
                minMonth = i;
            }
        }
        return minMonth + 1;

    }

    //количество месяцев,
    // в которых продажи были ниже среднего (см. п.2);
    public long numMonthMinAmount(long[] sales) {

        long averageSalesMonth = averageAmount(sales);

        long monthsCount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesMonth) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    //количество месяцев, в которых продажи были выше среднего
    public long numMonthMaxAmount(long[] sales) {

        long averageSalesMonth = averageAmount(sales);

        long monthsCount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesMonth) {
                monthsCount++;
            }
        }
        return monthsCount;

    }

}







