package com.foxhustle.calculator_fh.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private double timeRatio = 0.8;
    private double qualityRatio = 1;

    private double involvementRatio = 1;

    private int result;

    public double getTimeRatio() {
        return timeRatio;
    }

    public void setTimeRatio(double timeRatio) {
        this.timeRatio = timeRatio;
    }

    public double getQualityRatio() {
        return qualityRatio;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setQualityRatio(double qualityRatio) {
        this.qualityRatio = qualityRatio;
    }

    public double getInvolvementRatio() {
        return involvementRatio;
    }

    public void setInvolvementRatio(double involvementRatio) {
        this.involvementRatio = involvementRatio;
    }

    public int calculateResult(int value) {
        System.out.println("calculate result is working");
        result = (int) (value * timeRatio * qualityRatio * involvementRatio);
        System.out.println(result);
        System.out.println(value + " , " + qualityRatio + " , " + involvementRatio + " , " + timeRatio);

        return result;
    }

}
