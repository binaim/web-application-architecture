package mvc.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mvc.model.CalcModel;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Calculator {
//    private String num1;
//    private String num2;
//    private String operation;
//
//    public Calculator(String num1, String num2, String operation) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.operation = operation;
//    }
    public CalcModel calculate(CalcModel model){

        switch (model.getOperation()){
            case "+":
                 model.setResult(addition(Integer.parseInt(model.getNumber1()), Integer.parseInt(model.getNumber2())));
                 return model;
            case "-":
                model.setResult(subtraction(Integer.parseInt(model.getNumber1()), Integer.parseInt(model.getNumber2())));
                return model;
            case "*":
                model.setResult(multiplication(Integer.parseInt(model.getNumber1()), Integer.parseInt(model.getNumber2())));
            case "/":
                model.setResult(division(Integer.parseInt(model.getNumber1()), Integer.parseInt(model.getNumber2())));
                return model;
            default:
                model.setResult(0);
                return model;
        }

    }


    public double addition(int num1, int num2){
        return num1 + num2;
    }
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public double division(int num1, int num2){
        return  num1 / num2;
    }
}
