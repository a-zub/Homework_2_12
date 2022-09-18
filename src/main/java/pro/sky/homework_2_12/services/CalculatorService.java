package pro.sky.homework_2_12.services;

import org.springframework.stereotype.Service;
import pro.sky.homework_2_12.exception.DivisionByZeroException;

import java.lang.Number;

@Service
public class CalculatorService{

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
        if (num2 == 0) {
            throw new DivisionByZeroException(" Деление на ноль не возможно! ");
        }
        return num1 / (double)num2;
    }

    public String getAnswer(Number num1, Number num2, Number answer, String action) {
        return String.format("%d %s %d = %s", num1, action, num2, answer.toString());
    }

}