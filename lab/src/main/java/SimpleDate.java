package main.java;

import java.util.*;
import java.time.LocalDate;

// Класс для управления датами (упрощенный)
class SimpleDate {
    private LocalDate date;

    public SimpleDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
