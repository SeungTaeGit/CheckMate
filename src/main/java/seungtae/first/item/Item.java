package seungtae.first.item;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Item {

    private Long itemSequence;  // 리스트 고유 인덱스
    private LocalDate date;   // 날짜

    private String title;   // 제목
    private String content; // 내용
}
