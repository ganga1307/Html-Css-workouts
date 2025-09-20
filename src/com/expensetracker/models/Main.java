package com.expensetracker.models;

public class Main {
    private String name;
    private String email;
    private double MonthlyBudjet;
     public Main(String name,String email,double MonthlyBudjet){
        this.name=name;
        this.email=email;
        this.MonthlyBudjet=MonthlyBudjet;
    }
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getMonthlyBudjet(){
        return MonthlyBudjet;
    }
    public void setMonthlyBudjet(double MonthlyBudjet){
        this.MonthlyBudjet=MonthlyBudjet;
    }
}
