package pro.sky.calculator.services;

import org.springframework.stereotype.Service;
import java.lang.Number;

@Service
public class CalculatorServiceInpl implements Calculator {

    public Integer getAddition(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer getSubtraction(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer getMultiplication(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Double getDivision(Integer num1, Integer num2) {
        return num1 / (double)num2;
    }

    public String getAnswer(Number num1, Number num2, Number answer, String action) {
        return String.format("%d %s %d = %s", num1, action, num2, answer.toString());
    }

}