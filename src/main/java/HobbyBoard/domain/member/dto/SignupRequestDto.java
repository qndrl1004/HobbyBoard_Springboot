package HobbyBoard.domain.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequestDto {
    @NotNull(message = "이메일 입력은 필수입니다.")
    @Email
    private String email;

    @NotNull(message = "패스워드 입력은 필수입니다.")
    private String password;

    @NotNull(message = "사용할 닉네임을 정해주세요")
    private String nickname;
}