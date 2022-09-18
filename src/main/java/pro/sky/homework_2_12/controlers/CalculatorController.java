package pro.sky.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.services.CalculatorServiceInpl;
import java.util.Objects;



@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorServiceInpl calculatorService;

    public CalculatorController(CalculatorServiceInpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте два параметра";
        }
        return calculatorService.getAnswer(num1, num2, calculatorService.getAddition(num1, num2), "+");
    }

    @GetMapping("minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте два параметра";
        }
        return calculatorService.getAnswer(num1, num2, calculatorService.getSubtraction(num1, num2), "-");
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте два параметра";
        }
        return calculatorService.getAnswer(num1, num2, calculatorService.getMultiplication(num1, num2), "*");
    }

    @GetMapping("divide")
    public String division(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Передайте два параметра";
        }
        if (num2 == 0) {
            return "Деление на 0 не возможно!";
        }
        return calculatorService.getAnswer(num1, num2, calculatorService.getDivision(num1, num2), "/");
    }
}
