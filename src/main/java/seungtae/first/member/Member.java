package seungtae.first.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long sequence;  // 회원 고유 인덱스

    private String Id;  // 로그인 ID
    private String name;    // 사용자 이름
    private String password;    // 사용자 비밀번호
}
