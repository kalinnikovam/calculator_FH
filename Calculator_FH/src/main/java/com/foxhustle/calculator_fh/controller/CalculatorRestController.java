package com.foxhustle.calculator_fh.controller;

import com.foxhustle.calculator_fh.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorRestController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorRestController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/time")
    public ResponseEntity calculatorTime(
            @RequestBody String index) {
        calculatorService.setTimeRatio(Double.parseDouble(index));
        System.out.println("Параметр id = " + index + "   внедрен");
        System.out.println("салькулятор тайм ставится");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/quality")
    public ResponseEntity calculatorQuality(
                @RequestBody String index) {
            calculatorService.setQualityRatio(Double.parseDouble(index));
        System.out.println("салькулятор куолити ставится");
            return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/involvement")
    public ResponseEntity calculatorInvolvement(
            @RequestBody String index) {
        calculatorService.setInvolvementRatio(Double.parseDouble(index));
        System.out.println("салькулятор инволвемент ставится");
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/result")
    public ResponseEntity calculatorResult(
            @RequestBody String result) {
        System.out.println(result);
        calculatorService.calculateResult(Integer.parseInt(result));
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
