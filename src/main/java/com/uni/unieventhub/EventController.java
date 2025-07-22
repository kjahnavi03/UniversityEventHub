package com.uni.unieventhub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/events")  // Added base mapping
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("events", eventService.getAllEvents());
        return "home";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("event", new Event());
        return "addEvent";
    }

    @GetMapping("/events/add")
    public String showAddEventForm(Model model) {
        model.addAttribute("event", new Event());  // This fixes the error
        return "add-event"; // This should match the name of your HTML file (add-event.html)
    }
    
    @PostMapping("/events/add")
    public String addEvent1(@ModelAttribute Event event) {
        eventService.saveEvent(event);  // This assumes you have this method in your service
        return "redirect:/";
    }


    @PostMapping("/add")
    public String addEvent(@ModelAttribute Event event) {
        eventService.saveEvent(event);
        return "redirect:/events/";
    }
}
