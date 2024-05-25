package seungtae.first.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import seungtae.first.list.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Repository
public class ItemRepository {

    private static Map<Long, List> itemStore = new ConcurrentHashMap<>();
    private static long ItemSequence = 0L;
    private static LocalDate nowTime = LocalDate.now();

    // 리스트 추가
    public List saveItem(List list) {
        list.setItemSequence(++ItemSequence);
        list.setDate(nowTime);
        itemStore.put(list.getItemSequence(), list);

        log.info("Write Success!!! = {}", list);

        return list;
    }

    // 리스트 조회
    public List findByItemSequence(Long sequence) {
        return itemStore.get(sequence);
    }

    // 리스트 전체 조회
    public java.util.List<List> findAll() {
        return new ArrayList<>(itemStore.values());
    }

    // 리스트 수정
    public void update(Long sequence, List updateParam) {
        List findList = findByItemSequence(sequence);
        findList.setTitle(updateParam.getTitle());
        findList.setContent(updateParam.getContent());
        findList.setDate(updateParam.getDate());

        log.info("Edit Success!!! = {}", findList);
    }

    // 리스트 삭제
    public void delete(Long sequence) {
//        Long listItemSequence = list.getItemSequence();
        List findList = findByItemSequence(sequence);
        itemStore.remove(sequence, findList);

        log.info("Delete Success!!! = {}", findList);
    }
}
