package com.foxhustle.calculator_fh.controller;

import com.foxhustle.calculator_fh.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator(Model model) {
//        model.addAttribute(String.valueOf(calculatorService.getTimeRatio()), "time");
//        model.addAttribute(String.valueOf(calculatorService.getQualityRatio()), );
//        model.addAttribute(calculatorService.getInvolvementRatio(), )
        model.addAttribute("result", calculatorService.getResult());
        System.out.println("rrsult is ");
        System.out.println(calculatorService.getResult());
        return "calculator";
    }

    @GetMapping("/result")
    public String calculatorResult(Model model) {
        model.addAttribute("result", calculatorService.getResult());
        System.out.println("rrsult is ");
        System.out.println(calculatorService.getResult());
        return "result";
    }

}
