package com.bridgelabz;


public class Hotel {
    public String hotelName;
    public int weekdayRate;
    public int weekendRate;

    public Hotel(String hotelName, int weekdayRate, int weekendRate) {
        super();
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayRate() {
        return weekdayRate;
    }

    public void setWeekdayRate(int weekdayRate) {
        this.weekdayRate = weekdayRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    @Override
    public String toString() {

        return "HotelName = " + hotelName + ", WeekdayRate = "
                + weekdayRate + ", WeekendRate = " + weekendRate;
    }
}
