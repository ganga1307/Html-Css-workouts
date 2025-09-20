package com.expensetracker.models.expenses;
import java.time.LocalDate;

public class Expenses {
    private String Spendon;
    private double Amount;
    private LocalDate date;

    public String Expenses(String Spendon, double Amount, LocalDate date){
        this.Spendon=Spendon;
        this.Amount=Amount;
        this.date=LocalDate.now();

        public String getspendon(){
            return Spendon;
        }
        public double getamount(){
            return Amount;
        }
        public LocalDate getDate(){
            return date;
        }
    }
}
