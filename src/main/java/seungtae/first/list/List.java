package seungtae.first.list;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data @Setter @Getter
public class List {

    private Long itemSequence;  // 리스트 고유 인덱스
    private LocalDate date;     // 날짜

    private String title;       // 제목
    private String content;     // 내용

    public List() {
    }

    public List(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
