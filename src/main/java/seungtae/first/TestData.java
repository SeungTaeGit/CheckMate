package seungtae.first;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import seungtae.first.member.Member;
import seungtae.first.repository.MemberRepository;

@Component
@RequiredArgsConstructor
public class TestData {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        Member member = new Member();
        member.setId("st");
        member.setName("SeungTae");
        member.setPassword("123!");

        memberRepository.save(member);
    }
}

