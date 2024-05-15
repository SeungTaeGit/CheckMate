package seungtae.first;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import seungtae.first.list.List;
import seungtae.first.member.Member;
import seungtae.first.repository.ItemRepository;
import seungtae.first.repository.MemberRepository;

@Component
@RequiredArgsConstructor
public class TestData {

    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    @PostConstruct
    public void init() {
        memberRepository.save(new Member("ST", "SeungTae", "pw"));

        itemRepository.saveItem(new List("Test Todo", "Test Content"));
    }
}

