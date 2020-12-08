/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

/**
 *
 * @Philippe Ton-That
 */
public class Calendar {
    private int year;
    private int month;
    private int day;
    
    public Calendar(){
        this.year = 2020;
        this.month = 1;
        this.day = 1;
    }

    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Calendar(Calendar calendar){
        this.year = calendar.year;
        this.day = calendar.day;
        this.month = calendar.month;
    }
    public void increaseDay() {
        if (day > getDaysInMonth()) {
            day = 1;
        } else {
            day++;
        }
    
    }
    public void increaseMonth(){
       if (month > 12) {
           month = 1;
       } else{
           month++;        
       }
      
    }
    public int increaseYear(){
        this.year += 1;
        return year;
    }
    public boolean isLeapYear(){
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public int getDaysInMonth(){
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (isLeapYear()) {
            return 29;
        } else {
            return 28;
        }
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
    public boolean equals(Calendar calendar) {
        return this.day == calendar.day && this.month == calendar.month && this.year == calendar.year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
