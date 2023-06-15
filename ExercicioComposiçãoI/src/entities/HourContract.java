package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHours;
    private Integer hours;

    public HourContract(){
    }

    public HourContract(Date date, Double valuePerHours, Integer hours) {
        this.date = date;
        this.valuePerHours = valuePerHours;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHours;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHours = valuePerHour;
    }

    public Integer getHour() {
        return hours;
    }

    public void setHour(Integer hour) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHours * hours;
    }
}

