package mvc;

import mvc.model.CalcModel;
import mvc.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/calc")
public class HelloController {
    @Autowired
    private Calculator calculator;
   @GetMapping
    public ModelAndView hello( @RequestParam(value="number1") String number1,
                        @RequestParam(value="number2") String number2, @RequestParam(value = "operation") String operation) {
        CalcModel resultModel = calculator. calculate(new CalcModel(number1, number2, operation,0));
//        ModelAndView modelAndView = new ModelAndView("hello");
//        modelAndView.addObject("resultModel", resultModel);

//        String message=firstName+" "+lastName;
//
//        Map<String, Object> params = new HashMap<>();
//        params.put("message", message);
//
//        return new ModelAndView("hello",params);
        return new  ModelAndView("hello", "resultModel", resultModel);
    }
}

