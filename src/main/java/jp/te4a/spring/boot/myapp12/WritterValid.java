package jp.te4a.spring.boot.myapp12;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = {WritterValidator.class})
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface WritterValid {
    String ok();
    String message() default"Input=${valiedatedValue}";

    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload()default{};
}
