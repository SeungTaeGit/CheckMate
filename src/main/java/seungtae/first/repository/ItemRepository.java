package seungtae.first.repository;

import seungtae.first.member.Member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ItemRepository {

    private static Map<Long, Member> itemStore = new ConcurrentHashMap<>();
    private static long ItemSequence = 0L;

    // 리스트 추가
    public Member save(Member member) { // 리스트 저장
        member.setSequence(++ItemSequence);
        itemStore.put(member.getSequence(), member);
        return member;
    }

    // 리스트 조회
    public Member findBySequence(Long sequence) {
        return itemStore.get(sequence);
    }
}
