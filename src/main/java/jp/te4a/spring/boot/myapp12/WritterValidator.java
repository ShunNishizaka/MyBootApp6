package jp.te4a.spring.boot.myapp12;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class WritterValidator implements ConstraintValidator<WritterValid, String>  {
    String ok;
    @Override
    public void initialize(WritterValid x1 ){ok = x1.ok();}
    @Override
    public boolean isValid(String in, ConstraintValidatorContext cxt){
        if(in == null){
        return false;
        }
        System.out.println(in.equals(ok));
        return in.equals(ok);
    }

}

