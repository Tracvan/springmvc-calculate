package com.codegym.moneyexchange.controller;

import com.codegym.moneyexchange.model.CalculateModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/home")
    public String showResult(){
    return "home";
    }
    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam("firstNumber") String firstNumber,
                                  @RequestParam("secondNumber") String secondNumber,
                                  @RequestParam("operation") String operation){
        double result = 0;
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        if(operation.equals("plus")){
            result = num1 + num2;
        }else if (operation.equals("minus")){
            result = num1 - num2;
        } else if (operation.equals("devide")) {
            result = num1 / num2;
        } else if (operation.equals("multiplication")) {
            result = num1 * num2;
        }
        return new ModelAndView("result", "result", result);

    }



}
