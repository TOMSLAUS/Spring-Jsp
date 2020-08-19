package tomsspring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import validation.Code;

public class Student {
	
	
@NotNull(message="Name is required")
@Size(min=3, message = "Name needs to be longer than 3 leters")
private String firstName;
	
@NotNull(message="last name is required")
@Size(min=3, message = "last name needs to be longer than 3 leters")
private String lastName;

@NotNull(message="email is required")
@Pattern(regexp="[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", message="Email entered incorrectly")
private String email;


@Min(value=0, message="Must be more than 0")
@Max(value=15, message="Must be less than 15")
private Integer passes;

@Code(value = "rtu" ,  message = "should start with rtu")
private String code;

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public Integer getPasses() {
	return passes;
}

public void setPasses(Integer passes) {
	this.passes = passes;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
