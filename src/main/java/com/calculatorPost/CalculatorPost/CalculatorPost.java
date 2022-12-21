package com.calculatorPost.CalculatorPost;

import java.util.ArrayList;

public class CalculatorPost {
private ArrayList data;
private int max;
private int divisor;
private int limit;
    public CalculatorPost (ArrayList data) {
        this.data=data;
    }
    public ArrayList getData() {
        return data;
    }

    public CalculatorPost(int max, int divisor, int limit) {
        this.max = max;
        this.divisor = divisor;
        this.limit = limit;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int diviaor) {
        this.divisor = divisor;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }




        }


