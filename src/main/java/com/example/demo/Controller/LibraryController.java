package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {

    @GetMapping("/")
    public String index(Model model) {
        // model.addAttribute("books", bookSerivce.getBooks());
        // model.addAttribute("media", mediaSerivce.getMedia());
        return "index";
    }

        @PostMapping("/loan")
        public String loan(@RequestParam int id, int loanerid) {
        //bookService.loanBook(id,loanerid)
        return "redirect:/";
        }


}
