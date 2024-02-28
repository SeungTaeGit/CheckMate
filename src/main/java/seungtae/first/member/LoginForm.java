package seungtae.first.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginForm {

    @NotEmpty
    private String Id;

    @NotEmpty
    private String password;
}
