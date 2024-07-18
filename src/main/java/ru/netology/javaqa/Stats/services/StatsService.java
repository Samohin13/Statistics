package ru.netology.javaqa.Stats.services;


public class StatsService {
    // сумму всех продаж;
    public int sumYear(long[] sales) {

        long salesAmount = 0;

        for (int month = 0; month < sales.length; month++) {
            salesAmount = (salesAmount + sales[month]);

        }
        return (int) salesAmount;
    }

    //среднюю сумму продаж в месяц;
    public int averageAmount(long[] sales) {
        long averageSale = sumYear(sales) / 12; // Средняя сумма прожаж

        return (int) averageSale;

    }

    //номер месяца, в котором был пик продаж, то есть осуществлены
    // продажи на максимальную сумму*
    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++)
            if (sales[i] >= sales[maxMonth]) { // max месяц продаж
                maxMonth = i;
            }
        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж,
    // то есть осуществлены продажи на минимальную сумму*;
    public int minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++)
            if (sales[i] <= sales[minMonth]) {  // min месяц продаж
                minMonth = i;
            }
        return minMonth + 1;

    }

    //количество месяцев,
    // в которых продажи были ниже среднего (см. п.2);
    public int numMonthMinAmount(long[] sales) {

        int numMonMinAmount = averageAmount(sales);

        int sumMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > numMonMinAmount) {
                sumMonths++;
            }
        }
        return sumMonths;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int numMonthMaxAmount(long[] sales) {

        int numMonMaxAmount = averageAmount(sales);

        int sumMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < numMonMaxAmount) {
                sumMonths++;
            }
        }
        return sumMonths;

    }

}









































