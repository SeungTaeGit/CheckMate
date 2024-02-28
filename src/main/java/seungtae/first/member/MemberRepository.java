package seungtae.first.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Repository
public class MemberRepository {

    private static Map<Long, Member> store = new ConcurrentHashMap<>();
    private static long IdSequence = 0L;

    // 회원가입
    public Member save(Member member) {
        member.setSequence(++IdSequence);
        store.put(member.getSequence(), member);
        return member;
    }

    // 회원 조회
    public Member findBySequence(Long sequence) {
        return store.get(sequence);
    }

    // 회원 아이디로 조회
    public Optional<Member> findById(String Id) {
        return findAll().stream()
                .filter(m -> m.getId().equals(Id))
                .findFirst();
    }

    // 전체 회원 조회
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
