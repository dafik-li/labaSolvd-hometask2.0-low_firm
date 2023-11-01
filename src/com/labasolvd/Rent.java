package com.labasolvd;

import java.math.BigDecimal;

public class Rent {

    private BigDecimal cost;
    private int period;

    Rent(BigDecimal cost, int period) {
        this.cost = cost;
        this.period = period;
    }


    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
