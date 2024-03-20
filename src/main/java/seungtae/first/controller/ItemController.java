package seungtae.first.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import seungtae.first.item.Item;
import seungtae.first.repository.ItemRepository;

@Slf4j
@Controller
@RequestMapping("/list")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping
    public String items(@ModelAttribute Item item) {
        return "list/lists";
    }

    @GetMapping("/add")
    public String writeList(@ModelAttribute Item item) {
        return "list/writeListForm";
    }

    @PostMapping("/add")
    public String addListValid(@Validated @ModelAttribute Item item, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "list/add";
        }

        itemRepository.saveItem(item);
        log.info("Write Success!!! = {}", item);
        return "redirect:/";    // home
    }

    // 추후 업데이트
    @GetMapping("/item")    // 각 리스트의 개별 상세 페이지
    public String item() {
        return "list/item";
    }
}
