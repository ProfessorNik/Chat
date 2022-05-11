package ru.nsu.fit.chat.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.userdetails.User;

@Controller
@RequestMapping("/")
public class ChatController {
    @GetMapping("/chat")
    public String chat(@RequestParam(name="name", required=false, defaultValue="World") String name, @AuthenticationPrincipal User user , Model model) {
        model.addAttribute("name", name);
        return "chat";
    }
}
