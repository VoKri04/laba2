package org.example;

import java.util.Objects;

public class Payment {
    private String nameHuman;
    private int dayDate;
    private int monthDate;
    private int yearDate;
    private int sumPayment;

    public Payment(String nameHuman, int numberDate, int monthDate, int yearDate, int sumPayment) {
        this.nameHuman = nameHuman;
        this.dayDate = numberDate;
        this.monthDate = monthDate;
        this.yearDate = yearDate;
        this.sumPayment = sumPayment;
    }

    public String getFullName() {
        return nameHuman;
    }

    public int getDayDate() {
        return dayDate;
    }

    public int getMonthDate() {
        return monthDate;
    }

    public int getYearDate() {
        return yearDate;
    }

    public int getSumPayment() {
        return sumPayment;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public void setNumberDate(int numberDate) {
        this.dayDate = numberDate;
    }

    public void setMonthDate(int monthDate) {
        this.monthDate = monthDate;
    }

    public void setYearDate(int yearDate) {
        this.yearDate = yearDate;
    }
    public void setSumPayment(int sumPayment) {
        this.sumPayment = sumPayment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "nameHuman='" + nameHuman + '\'' +
                ", numberDate=" + dayDate +
                ", monthDate=" + monthDate +
                ", yearDate=" + yearDate +
                ", sumPayment=" + sumPayment +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return dayDate == payment.dayDate && monthDate == payment.monthDate && yearDate == payment.yearDate && sumPayment == payment.sumPayment && Objects.equals(nameHuman, payment.nameHuman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameHuman, dayDate, monthDate, yearDate, sumPayment);
    }
}
