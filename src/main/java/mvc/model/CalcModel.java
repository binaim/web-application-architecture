package mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CalcModel {
    private String number1;
    private String number2;
    private String operation;
    private double result;
}
