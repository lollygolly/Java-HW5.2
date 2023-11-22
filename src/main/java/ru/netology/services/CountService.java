package ru.netology.services;

public class CountService {
    public int calculate(int threshold, int income, int expenses) {
        int count = 0; // Счетчик месяцев отдыха
        int money = 0; // Начальная сумма на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // Можем ли отдыхать?
                count++; // Отдыхаем
                money = (money - expenses) / 3; // Накопления уменьшаются на ежемесячные траты и деньги на отдых
            } else { // работаем
                money = money + income - expenses; // Накопления увеличиваются на доход и уменьшаются на ежемесячные траты
            }
        }
        return count;
    }

}




