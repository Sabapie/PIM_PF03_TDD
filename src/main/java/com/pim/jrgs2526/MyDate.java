package com.pim.jrgs2526;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MyDate {

    public static final String ERR_INVALID_YEAR = "Year value not valid";
    public static final String ERR_INVALID_MONTH = "Month value not valid";
    public static final String ERR_INVALID_DAY = "Day value not valid";
    public static final String ERR_INVALID_DATE = "Invalid date";

    private int day;
    private Months month;
    private int year;
    boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


    public MyDate(int day, Months month, int year) {
        this.day = day;
        this.month = month;
        if (isLeapYear(month, day)) this.year = year; else throw new IllegalArgumentException(ERR_INVALID_YEAR);
    }

    public MyDate(){

    }

    public boolean isLeapYear(Months month, int day) {
        if(month == Months.FEBRUARY && day == 29){
            if (leapYear) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int getDay() {
        return day;
    }

    public Months getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(Months month) {
        this.month = month;
    }

    public void setYear(int year) {
        if () {
            throw new IllegalArgumentException(ERR_INVALID_YEAR);
        } else if (year < actualDate.getYear()){
            throw new IllegalArgumentException(ERR_INVALID_YEAR);
        }
        else {
            this.year = year;
        }
    }

    public enum Months {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        public final int monthNumber;

        private Months(int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public static Months toMonth( int monthNumber ) {
            for (Months m : values())
                if (m.monthNumber == monthNumber)
                    return m;
            return null;
        }



    }
}
