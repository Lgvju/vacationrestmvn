package ru.netology.services;
public class VacationRestService {
    public int calculate (int income, int expenses, int threshold) {
        int money = 0;
        int monthsRest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //отдых
                money -= expenses;
                money /= 3;
                monthsRest++;
            } else {
                // работаем
                money += income;
                money -= expenses;
            }
        }

        return monthsRest;
    }
}
