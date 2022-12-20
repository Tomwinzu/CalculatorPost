package com.calculatorPost.CalculatorPost;

public class CalculatorPost {
private String data;
private int max;
private int divisor;
private int limit;


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

    public CalculatorPost (String data) {
        this.data = data;}
        public String getData () {
            return data;
        }
    }

