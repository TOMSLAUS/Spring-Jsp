package validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;

import org.springframework.messaging.handler.annotation.Payload;

@Constraint(validatedBy = CodeConstraintValidator.class )
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Code {

	public String value() default "code";
	
	public String message() default "Must start with code";
	
	public Class<? > [] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
