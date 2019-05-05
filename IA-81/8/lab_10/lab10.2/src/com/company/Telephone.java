package com.company;

import java.util.Objects;

public  class Telephone {
    private String model;
    private double needMoney; // расход на 1 звонок
    private double moneyInPhone; //остаток



    public double getMoneyInPhone() {
        return moneyInPhone;
    }

    public void setMoneyInPhone(double moneyInPhone) {
        this.moneyInPhone = moneyInPhone;
    }


    public double getNeedMoney() {
        return needMoney;
    }

    public void setNeedMoney(double needMoney) {
        this.needMoney = needMoney;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    Telephone(String model,double needMoney,double moneyInPhone){
        this.model= model;
        this.needMoney=needMoney;
        this.moneyInPhone=moneyInPhone;

    }

    //поповнити рахунок
    void GiveMoney(int moneyIn){
        moneyInPhone=moneyInPhone+moneyIn;
    }
    void Call(){
        if ( moneyInPhone< needMoney ){
        }
        else{
            moneyInPhone=moneyInPhone-needMoney;
        }

    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telephone)) return false;
        Telephone telephone = (Telephone) o;
        return Objects.equals(model, telephone.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                " model='" + model + '\'' +
                " money " + moneyInPhone+
                '}';
    }
}
