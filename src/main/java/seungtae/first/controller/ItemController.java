package seungtae.first.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import seungtae.first.list.List;
import seungtae.first.repository.ItemRepository;

@Slf4j
@Controller
@RequestMapping("/list")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {
        java.util.List<List> lists = itemRepository.findAll();
        model.addAttribute("lists", lists);
        return "list/lists";
    }

    @GetMapping("/{sequence}")
    public String list(@PathVariable Long sequence, Model model) {
        List list = itemRepository.findByItemSequence(sequence);
        model.addAttribute("list", list);
        return "list/list";
    }

    @GetMapping("/add")
    public String writeList(@ModelAttribute List list) {
        return "list/writeListForm";
    }

    @PostMapping("/add")
    public String addListValid(@Validated @ModelAttribute List list, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "list/add";
        }

        itemRepository.saveItem(list);
        log.info("Write Success!!! = {}", list);
        return "redirect:/list";    // Lists 페이지
    }

}
