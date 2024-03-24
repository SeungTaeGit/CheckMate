package seungtae.first.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import seungtae.first.item.Item;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Repository
public class ItemRepository {

    private static Map<Long, Item> itemStore = new ConcurrentHashMap<>();
    private static long ItemSequence = 0L;
    LocalDate nowTime = LocalDate.now();

    // 리스트 추가
    public Item saveItem(Item item) {
        item.setItemSequence(++ItemSequence);
        item.setDate(nowTime);
        itemStore.put(item.getItemSequence(), item);
        return item;
    }

    // 리스트 조회
    public Item findByItemSequence(Long sequence) {
        return itemStore.get(sequence);
    }
}
