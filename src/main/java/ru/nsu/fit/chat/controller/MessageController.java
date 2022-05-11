package ru.nsu.fit.chat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.chat.Service.MessageService;

@RestController
@RequestMapping("message")
public class MessageController {
    private MessageService service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

}
