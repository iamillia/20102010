package com.company;

import java.util.Comparator;

public class Smartphone extends Telephone {
    private String color;
    private double energyInPhone;
    private double needEnergy;

    Smartphone(String model, double needMoney, double moneyInPhone) {
        super(model, needMoney, moneyInPhone);
    }

    Smartphone(String model, double needMoney, double needEnergy, double energyInPhone, double moneyInPhone, String color) {
        super(model, needMoney, moneyInPhone);
        this.color = color;
        this.needEnergy = needEnergy;
        this.energyInPhone = energyInPhone;

    }

    public String getColor() {
        return color;
    }

    public double getEnergyInPhone() {
        return energyInPhone;
    }

    public double getNeedEnergy() {
        return needEnergy;
    }

    //зарядити телефон
    void charge(int energyIn) {
        energyInPhone = energyInPhone + energyIn;
    }

    public void phone() {
        System.out.println(getModel());
    }

    @Override
    void Call() {
        if (getMoneyInPhone() < getNeedMoney() || energyInPhone < needEnergy) {
        } else {
            energyInPhone = energyInPhone - needEnergy;
            setMoneyInPhone(getMoneyInPhone() - getNeedMoney());
        }

    }

    @Override
    public String toString() {
        return "Smartphone{" + getModel() +
                " color='" + color + '\'' +
                " money " + getMoneyInPhone() +
                " energy " + energyInPhone +
                '}';
    }
}