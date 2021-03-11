package com.example.demo.Controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class LibraryController {

    @GetMapping("/")
    public String index(Model model) {
        // model.addAttribute("books", bookSerivce.getBooks());
        // model.addAttribute("media", mediaSerivce.getMedia());
        return "index";
    }

    @PostMapping("/loanBook")
    public String loanBook(@RequestParam int id, int loanerid) {
        //bookService.loanBook(id,loanerid)
        return "redirect:/";
    }


}
