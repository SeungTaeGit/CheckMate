package seungtae.first.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {

    private Long itemSequence;  // 리스트 고유 인덱스

    private String writer;  // 작성자
    private int date;   // 날짜
    private String title;   // 제목
    private String content; // 내용
}
