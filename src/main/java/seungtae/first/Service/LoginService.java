package seungtae.first.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import seungtae.first.member.Member;
import seungtae.first.member.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String Id, String password) {
        return memberRepository.findById(Id)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
