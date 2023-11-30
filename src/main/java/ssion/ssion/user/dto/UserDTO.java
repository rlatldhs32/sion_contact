package ssion.ssion.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ssion.ssion.user.model.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String nick;
    private String email;

    public User toEntity() {
        return User.builder()
                .nick(nick)
                .email(email)
                .build();
    }
}
