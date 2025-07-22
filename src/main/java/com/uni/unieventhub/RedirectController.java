package com.uni.unieventhub;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/")
    public String redirectToEvents() {
        return "redirect:/events/";
    }
}

