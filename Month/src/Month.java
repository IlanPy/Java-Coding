/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ilans
 */
public class Month {
    private int monthNumber;
    
    public Month(int m) {
        if(m<1 || m>12){
            monthNumber = 1;
        } else {
            monthNumber = m;
        }
    }
    
    public void setMonthNumber(int m) {
        if(m<1 || m>12){
            monthNumber = 1;
        } else {
            monthNumber = m;
        }
    }
    
    public int getMonthNumber() {
        return monthNumber;
    }
    
    public String getMonthName() {
        String monthName = null;
        switch(monthNumber)
        {
            case 1: monthName = "January";
                    break;
            case 2: monthName = "February";
                    break;
            case 3: monthName = "March";
                    break;
            case 4: monthName = "April";
                    break;
            case 5: monthName = "May";
                    break;
            case 6: monthName = "June";
                    break;
            case 7: monthName = "July";
                    break;
            case 8: monthName = "August";
                    break;
            case 9: monthName = "September";
                    break;
            case 10: monthName = "October";
                    break;
            case 11: monthName = "November";
                    break;
            case 12: monthName = "December";
                    break;
        }
        return monthName;
    }
    
    public String getSeason() {
        String season = null;
        switch(monthNumber)
        {
            case 12:
            case 1:
            case 2: season = "Winter";
                    break;
            case 3:
            case 4:
            case 5: season = "Spring";
                    break;
            case 6:
            case 7:
            case 8: season = "Summer";
                    break;
            case 9:
            case 10:
            case 11: season = "Fall";
                     break;
        }
        return season;
    }
    
    public String toString() {
        return getMonthName();
    }
    
    public boolean greaterThan(Month month2) {
        boolean status;
        if(monthNumber>month2.monthNumber){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }
    
    public boolean equals(Month month2) {
        boolean status;
        if(this.monthNumber == month2.monthNumber) {
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }
}
